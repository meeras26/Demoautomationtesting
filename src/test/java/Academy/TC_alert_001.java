package Academy;

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

public class TC_alert_001 extends base
{
	@BeforeTest
	public void initalise() throws IOException
	{
		driver=initialiseDriver();
		
	}
	@Test
	public void checkingalertbtn() throws IOException, InterruptedException
	{

		driver.get(prop.getProperty("url"));
        HomePage hp=new HomePage(driver);
	    hp.getEmail().sendKeys("testing4hobby@gmail.com");
	    hp.getEnterbtn().click();
		SwitchtoPage sp=new SwitchtoPage(driver);
		sp.getswitchtolink().click();
		sp.getAlertlink().click();
		
		sp.getbtn().click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(5000);
		sp.getok().click();
		sp.getOkCancel().click();
		Alert al=driver.switchTo().alert();
		al.accept();
		sp.getok().click();
		sp.getOkCancel().click();
		Alert alr=driver.switchTo().alert();
		alr.dismiss();
		sp.getalTextbox().click();
		sp.getPrompt().click();
		Alert atext=driver.switchTo().alert();
		atext.sendKeys("jhghghjg");
		atext.accept();
		sp.getPrompt().click();
		Alert atex=driver.switchTo().alert();
		atex.dismiss();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
