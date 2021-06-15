package ma.priz.test;

import java.util.Arrays;

public class Exercice7 {
	
	
	public static void main(String[] args) {
		boolean resultat = isAnanagrammme("chine", "niche");
		System.err.println(resultat);
	}
	
	
	private static boolean isAnanagrammme(String chaine1, String chaine2) {
		char[] firstChars = chaine1.toLowerCase().toCharArray();
		char[] secondChars = chaine2.toLowerCase().toCharArray();
		Arrays.sort(firstChars);
		Arrays.sort(secondChars);
		return Arrays.equals(firstChars, secondChars);
	}
}
