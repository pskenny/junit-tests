package example;

// Taken from Software Testing course material and adapted
public class MyClass {

	public int multiply(int x, int y) {
		// the following is just an example
		if (x > 999) {
			throw new IllegalArgumentException("X should be less than 1000");
		}
		return x * y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
