package learning;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Set;

public class EncryptionTest
{
    public static void main(String[] args)
    {
        md5Test();
        testColp();
        
    }

    public static void md5Test()
    {
        try
        {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            MessageDigest sha = MessageDigest.getInstance("SHA-1");
            String msg = "ankit katiyar";
            md5.update(msg.getBytes());
            sha.update(msg.getBytes());
            System.out.println("Md5: " + String.valueOf(Base64.getEncoder().encode(md5.digest())));
            System.out.println("SHA-3: " + String.valueOf(sha.digest()));
        }
        catch (NoSuchAlgorithmException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void testColp()
    {
        
    }
}
