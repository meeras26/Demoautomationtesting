package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobjects.DatepickerPage;
import Pageobjects.Widgets_page;
import resourses.base;

public class TC_Datepicker extends base
{
	@BeforeTest
	public void initalise() throws IOException
	{
		driver=initialiseDriver();
		System.out.println("reached here1");
	}
	@Test
	public void get_calander()
	{
		System.out.println("reached here2");
		getlogin();
		Widgets_page wp=new Widgets_page(driver);
		wp.getWidgetliink().click();
		wp.getdatepickerlink().click();
		DatepickerPage dp=new DatepickerPage(driver);
		dp.getCalander().click();
		dp.getMonth();
		dp.getDates();
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
}