package example;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyClassTest {

	@BeforeClass
	public static void testSetup() {
		System.out.println("Run before");
		// Set things up before test
	}

	@AfterClass
	public static void testCleanup() {
		System.out.println("Run after");
		// Cleanup for data used by test
	}

	@Test(expected = IllegalArgumentException.class)
	public void testExceptionIsThrown() {
		MyClass tester = new MyClass();
		tester.multiply(1000, 5);
	}

	@Test
	public void testMultiply() {
		MyClass tester = new MyClass();
		assertEquals("10 * 5 must be 50", 50, tester.multiply(10, 5));
	}
}
