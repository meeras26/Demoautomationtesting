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
import org.testng.annotations.Test;

import Pageobjects.AutocompletePage;
import Pageobjects.Widgets_page;
import resourses.base;

public class TC_Autocomplete_001 extends base
{

	@BeforeTest
	public void initalise() throws IOException
	{
		driver=initialiseDriver();
		
	}
	@Test
	public void getAutocompletion()
	{
		
		getlogin();
		Widgets_page wp=new Widgets_page(driver);
		wp.getWidgetliink().click();
		wp.getautocompltelink().click();
		AutocompletePage ag=new AutocompletePage(driver);
		ag.getAutocompletebox().sendKeys("aasmsdhs jhdjhsjhd");
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
