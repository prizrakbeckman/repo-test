package ma.priz.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

public class Exercice2 {
	int sum = 0;
	Collection<A> read(InputStream stream) throws IOException {
		/* omitted */ 
		return null;}

	Collection<? extends A> readFile(File file) throws IOException {
		final InputStream stream = new FileInputStream(file);
		final Collection<? extends A> values = read(stream);
		stream.close();
		return values;
	}
	Collection<? extends Integer> getNumbers(Collection<? extends A> inputs) { /* omitted */
		return null;
	}

	int sum(Collection<? extends Integer> values) {
		values.stream().forEach(val -> sum+=val);
		return sum;
	}
	double sumDouble(Collection<? extends Double> values) {
		return 0;
// idem previous method
}
	public void test() throws IOException {
		final File file = new File("");
		
		final Collection<? extends A> inputs = readFile(file);
		final Collection<? extends Integer> numbers = getNumbers(inputs);
		System.out.println(sum(numbers));
}
}

class A {
	int getVal(int a) {
		return 0;
	}
	int getVal(int a, int b) {
		return 0;
	}
}

class B extends A {
	int getVal() {
		return 1;
	}
}