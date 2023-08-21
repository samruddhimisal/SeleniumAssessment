package TestCases;

/*
 * Approach-2 :
 * Arrange, act and assert are performed in utilities java file.
 */

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utils.TestUtils;

/* Use Cases to be covered
1. Navigate to Homepage.
2. In the test 4 div, assert that the first button is enabled and that the second button is disabled
*/

public class Test4 extends TestUtils
{
	@Test
	public void verifyButtons() throws Throwable
	{
		//Navigate to the home page
		navigateToHome();
		
		//Scroll to the Test4 form
		scrollToAForm(driver.findElement(By.xpath(xPathProp.getProperty("h_test4Header"))));
		
		//Verify that the primary button is enabled and the secondary button is disabled
		verifyButtonsStatus();
	}
}
