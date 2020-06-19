package Academy;
/* Scenario
 1.Open the browser enter the url,login page should be displayed.
 2.Enter the login details and click on ok,Home page should be displayed.
 3.Click on switchtolink,Dropdown will displayed.
 4.click on alert link,Alert page will displayed.
 5.Click the alert with ok link,click button to display an alertbox.
 6.Alert box will disply,clickon ok. 
 7.Close the browser.
 */
import java.io.IOException;

import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobjects.HomePage;
import Pageobjects.SwitchtoPage;
import resourses.base;

public class TC_firstalert extends base
{
	@BeforeTest
	public void initalise() throws IOException
	{
		driver=initialiseDriver();
		
	}
	@Test
	public void checkingfirstalertbtn() throws IOException, InterruptedException
	{
		getlogin();
		SwitchtoPage sp=new SwitchtoPage(driver);
		sp.getswitchtolink().click();
		sp.getAlertlink().click();
	    sp.getalertwithoklink().click();
	    Alert alt=driver.switchTo().alert();
		alt.accept();
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
}
