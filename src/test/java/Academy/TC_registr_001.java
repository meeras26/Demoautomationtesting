package Academy;

import java.io.IOException;

import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobjects.HomePage;
import Pageobjects.RegisterPage;
import resourses.base;

public class TC_registr_001 extends base
{
	@BeforeTest
	public void initalise() throws IOException
	{
		driver=initialiseDriver();
		
	}
	@Test
	public void validateregistration() throws IOException
	{
	driver.get(prop.getProperty("url"));
    HomePage hp=new HomePage(driver);
    hp.getEmail().sendKeys("testing4hobby@gmail.com");
    hp.getEnterbtn().click();
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
//	rp.getLanguage().sendKeys("hjsjsgjshj");
//	rp.getSkills().click();
	rp.getselectedoptn().selectByValue("Adobe InDesign");
	rp.getCountry().selectByVisibleText("Afghanistan");
	rp.getselctctry().click();
	rp.getdoby().selectByValue("1917");
	rp.getdobm().selectByValue("February");
	rp.getdobd().selectByValue("3");
	rp.getFpassword().sendKeys("abcdef123");
	rp.getConpassword().sendKeys("abcdef123");
//	Thread.sleep(3000);
//	Runtime.getRuntime().exec("C:\\Users\\user\\Downloads\\fileupload.exe");
//	System.out.println(rp.getPhoto());
	rp.getPhoto().sendKeys("C:\\Users\\user\\Pictures\\dsc085421.jpg");
	rp.getSubmit().click();
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
