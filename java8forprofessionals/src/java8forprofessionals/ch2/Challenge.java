package java8forprofessionals.ch2;

import java.util.Base64;

public class Challenge {
	public static void main(String[] args) {
		String bye = "Bye";
		System.out.println(toBase64(bye.getBytes()));
	}
	
	public static String toBase64(byte[] bye) {
		return Base64.getEncoder().encodeToString((byte[])bye);
	}
}
