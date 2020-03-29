package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Pageobjects.AccordianPage;
import Pageobjects.HomePage;
import resourses.base;

public class TC_Widgets_001 extends base
{
	@BeforeTest
	public void initalise() throws IOException
	{
		driver=initialiseDriver();
		
	}
public void checkingaccordian()
{
	driver.get(prop.getProperty("url"));
    HomePage hp=new HomePage(driver);
    hp.getEmail().sendKeys("testing4hobby@gmail.com");
    hp.getEnterbtn().click();
	AccordianPage ap=new AccordianPage (driver);
	ap.clickWidgetlink().click();
	ap.clickAccordianlink();
    ap.getFirstCollapse().click();
	ap.getSecondCollapse().click();
	ap.getthirdCollapse().click();
	ap.getforthCollapse().click();
}
@AfterTest
public void teardown()
{
	driver.close();
}

}
