package Academy;
/* Scenario
1.Open the browser enter the url,login page should be displayed.
2.Enter the login details and click on ok,Home page should be displayed.
3.Click on switchtolink,Dropdown will displayed.
4.Click on alert,alert page will dispayed.
5.Click on alert link with ok and cancel,Then click on button to display a confirm box.
6.Alert box will displayed,Click on ok,alert will getting closed.
*/
import java.io.IOException;
import org.openqa.selenium.Alert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pageobjects.SwitchtoPage;
import resourses.base;
public class TC_Secondalert_clickingcancel extends base
{
	/*Method for initialise driver*/ 
	@BeforeClass
	public void initalise() throws IOException
	{
		driver=initialiseDriver();
	}
    /*Method for clicking secondalert and clicking cancel in the alertbox*/ 
	@Test
	public void checking_secondalertbtn_with_cancel()throws IOException, InterruptedException
	{
		getlogin();
		SwitchtoPage sp=new SwitchtoPage(driver);
		sp.getswitchtolink().click();
		sp.getAlertlink().click();
	    sp.getalertwithokandcancel().click();
	    sp.clickbtntodisplayconfirmbox().click();
   	    Alert al=driver.switchTo().alert();
		al.dismiss();
	}
    /*Method for close the brower.*/	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}

}
