package hyunhee_project;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {
	public static void main(String[] args) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			System.out.println(byteArrayToHex(md.digest("dog".getBytes())));
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
	
	public static String byteArrayToHex(byte[] a) {
		   StringBuilder sb = new StringBuilder(a.length * 2);
		   for(byte b: a)
		      sb.append(String.format("%02x", b));
		   return sb.toString();
		}
}
