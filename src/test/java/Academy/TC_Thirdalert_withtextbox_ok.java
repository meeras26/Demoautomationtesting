package Academy;
/*Scenario
1.Open the browser enter the url,login page should be displayed.
2.Enter the login details and click on ok,Home page should be displayed.
3.Click on switchtolink,Dropdown will displayed.
4.click on alert link,Alert page will displayed.
5.Click on alert with text link,Click button to demonstrate prompt box.
6.Enter the text to prompt box,click on ok.
7.close the browser.
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


public class TC_Thirdalert_withtextbox_ok extends base{
    /*Method for initialising browser*/
	@BeforeClass
	public void initalise() throws IOException
	{
		driver=initialiseDriver();
	}
    /* Method to clickon thirdalert.and sending text to the textbox and clickon accept*/	
	@Test
	public void checking_thirdalertbtn_withok()throws IOException, InterruptedException
	{
		getlogin();
		SwitchtoPage sp=new SwitchtoPage(driver);
		sp.getswitchtolink().click();
		sp.getAlertlink().click();
		sp.getalTextbox().click();
		sp.getPrompt().click();
   	    Alert al=driver.switchTo().alert();
   	    al.sendKeys("jhghghjg");
 	    al.accept();
	}
    /* Method for close the browser*/ 
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	
}
