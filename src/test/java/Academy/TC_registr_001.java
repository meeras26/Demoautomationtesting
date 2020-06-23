package Academy;
/*Scenario
 1.Open the browser enter the url,login page should be displayed.
 2.Enter the login details and click on ok,Home page should be displayed.
 3.Clck on registration link,Registration page should be displayed.
 4.Enter the registration  details and click on ok.
 5.Close the browser.
 */

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pageobjects.RegisterPage;
import resourses.base;

public class TC_registr_001 extends base
{
	/* Method for initializing driver */
    @BeforeClass
	public void initalise() throws IOException
	{
		driver=initialiseDriver();
	}
    /*  Method used to send the values to the registration page. */
    @Test
	public void validateregistration() throws IOException
	{
		getlogin();
		RegisterPage rp=new RegisterPage(driver);
	//	WebElement h=rp.getheading();
	//    String hd=h.getText();
	//	Assert.assertEquals(hd,"hgff");
		rp.getFirestname().sendKeys("xyz");
		rp.getLastname().sendKeys("ddsdd");
		rp.getAddress().sendKeys("hjkhf fjhkfh kfjahkjfha");
		rp.getemail().sendKeys("testing4hobby@gmail.com");
		rp.getPhone().sendKeys("9089889080");
		rp.getRadiobtn().click();
		rp.getCheckbox().click();
		rp.getselectedoptn().selectByValue("Adobe InDesign");
		rp.getCountry().selectByVisibleText("Afghanistan");
		rp.getselctctry();
		rp.getdoby().selectByValue("1917");
		rp.getdobm().selectByValue("February");
		rp.getdobd().selectByValue("3");
		rp.getFpassword().sendKeys("abcdef123");
		rp.getConpassword().sendKeys("abcdef123");
	//    rp.getPhoto().sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Hydrangeas.jpg");
		rp.getSubmit().click();
	}
    /*Method to close the driver.*/
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	

}
