package testcases;

import org.junit.Assert;
import org.junit.Test;

public class UnderstandAssertions {

	@Test
	public void testFriendListFacebook() {
		int actualTotalFriends = 100;// Selenium
		int expectedTotalFriends = 101;// XLSX file

		if (actualTotalFriends == expectedTotalFriends) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		// Assert.assertEquals(expected_total_friends,actual_total_friends);
	}

}
