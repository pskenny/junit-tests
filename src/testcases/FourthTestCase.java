package testcases;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;

public class FourthTestCase {

	@BeforeClass
	public static void beginning() {
		System.out.println("*****Beginning******");
	}

	@AfterClass
	public static void ending() {
		System.out.println("*****Ending******");
	}

	@Before
	public void openBrowser() {
		// open Browser-Selenium
		System.out.println("Open Browser");
	}

	@Test
	public void sendingEmailTest() {
		System.out.println("Testing Sending Email");
	}

	@Test
	public void sendingMesageTest() {
		System.out.println("Testing Sending Message");
	}

	// close Browser
	@After
	public void closeBrowser() {
		// closing Browser Selenium
		System.out.println("Close Browser");
	}
}
