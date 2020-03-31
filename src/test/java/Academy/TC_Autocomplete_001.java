package Academy;



import java.io.IOException;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobjects.AutocompletePage;
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
		System.out.println("reached here");
		getlogin();
		AutocompletePage ag=new AutocompletePage(driver);
		System.out.println("reached here");
		ag.clickWidgetlink().click();
		ag.clickAutocompletelink().click();
		ag.getAutocompletebox().sendKeys("aasmsdhs jhdjhsjhd");
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
