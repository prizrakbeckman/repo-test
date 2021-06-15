package ma.priz.test;

import java.util.stream.IntStream;

public class TestMain {
	
	private static final int TAILLE_TABLEAU= 100;
	
	private static final int INDEX_INITIAL = 0;
	
	private static double[][]  resultatMultiplication = new double[TAILLE_TABLEAU][];
	
	public static void main(String[] args) {
		initializeTableau();
		multiplierValeurs();
		System.err.println(resultatMultiplication);
		
	}
	
	private static void multiplierValeurs() {
		IntStream.range(INDEX_INITIAL, TAILLE_TABLEAU)
		.boxed()
		.forEach( valX -> {
			IntStream.range(INDEX_INITIAL, TAILLE_TABLEAU)
			.boxed()
			.forEach(valY -> resultatMultiplication[valX][valY] = (valX+1)*(valY+1));
		});
	}
	
	private static void initializeTableau() {
		IntStream.range(0, 9).boxed().forEach(i -> resultatMultiplication[i] = new double[TAILLE_TABLEAU]);
	}
	
}
