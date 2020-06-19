/* Scenario
1.Open the browser enter the url,login page should be displayed.
2.Enter the login details and click on ok,Home page should be displayed.
3.Click on widgets,Drop down will displayed.
4.Click on autocomplete,Auto complete page will displyed.
5.Enter the text.
*/



package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Pageobjects.AccordianPage;
import Pageobjects.HomePage;
import resourses.base;

public class TC_Widget_page extends base
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
