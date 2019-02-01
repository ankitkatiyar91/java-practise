package learning;

import java.io.Serializable;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignedObject;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SealedObject;
import javax.crypto.SecretKey;

public class SecureObjects
{

    public static void main(String[] args)
    {
        try
        {

            System.out.println("################### Sealed Object Example ##################");
            Serializable obj = new String("Ankit");
            // Generate key
            KeyGenerator kgen = KeyGenerator.getInstance("AES");
            kgen.init(128);
            SecretKey aesKey = kgen.generateKey();
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, aesKey);

            // Sealed Object
            SealedObject sealedObject = new SealedObject(obj, cipher);
            System.out.println("sealedObject-" + sealedObject);
            System.out.println("sealedObject Data-" + sealedObject.getObject(aesKey));

            // test signed object
            System.out.println("################### Signed Object Example ##################");
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA", "SUN");
            SecureRandom random = SecureRandom.getInstance("SHA1PRNG", "SUN");
            keyGen.initialize(1024, random);

            KeyPair pair = keyGen.generateKeyPair();
            PrivateKey signingKey = pair.getPrivate();

            Signature signingEngine = Signature.getInstance("DSA");
            signingEngine.initSign(signingKey);

            SignedObject signedObject = new SignedObject(obj, signingKey, signingEngine);

            System.out.println("signedObject-" + signedObject);
            System.out.println("signedObject Data-" + signedObject.getObject());
            // check authenticity of data
            boolean bl = signedObject.verify(pair.getPublic(), signingEngine);
            System.out.println("Authentic: " + bl);

        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
