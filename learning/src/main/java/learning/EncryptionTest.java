package learning;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.xml.bind.DatatypeConverter;

public class EncryptionTest {
	public static void main(String[] args) {
		md5Test();
	}

	public static void md5Test() {
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			MessageDigest sha = MessageDigest.getInstance("SHA-1");
			String msg = "ankit katiyar";
			md5.update(msg.getBytes());
			sha.update(msg.getBytes());

			System.out.println("Md5: " + String.valueOf(Base64.getEncoder().encode(md5.digest())));
			System.out.println("SHA-3: " + String.valueOf(sha.digest()));

			BigInteger no = new BigInteger(1, md5.digest());
			System.out.println("Number: " + no);
			// Convert message digest into hex value
			String hashtext = no.toString(16);
			System.out.println("Md5: " + hashtext);

			System.out.println("Md5: " + DatatypeConverter.printHexBinary(md5.digest()));

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

}
