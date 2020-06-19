
/*Scenario
 1.Open the browser enter the url,login page should be displayed.
 2.Enter the login details and click on ok,Home page should be displayed.
 3.Click on switchtolink,Dropdown will displayed.
 4.click on alert link,Alert page will displayed.
 5.Click on alert with text link,Click button to demonstrate prompt box.
 6.click on cancel.
 7.Close the browser.
 */
package Academy;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobjects.SwitchtoPage;
import resourses.base;

public class TC_Thirdalert_withtextbox_cancel extends base{
	@BeforeTest
	public void initalise() throws IOException
	{
		driver=initialiseDriver();
		
	}
	@Test
	public void checking_thirdalertbtn_withcancel()throws IOException, InterruptedException
	{
		getlogin();
		SwitchtoPage sp=new SwitchtoPage(driver);
		sp.getswitchtolink().click();
		sp.getAlertlink().click();
		sp.getalTextbox().click();
		sp.getPrompt().click();
   	    Alert al=driver.switchTo().alert();
   	    al.dismiss();
	}

	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
