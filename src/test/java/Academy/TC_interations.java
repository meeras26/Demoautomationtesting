package Academy;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Pageobjects.InteractionsPage;
import resourses.base;


public class TC_interations extends base {
	@BeforeTest
	public void initalise() throws IOException
	{
		System.out.println("reached here1");
		driver=initialiseDriver();
		
	}
  
@Test
   public void getDropanddrag()
   {
	System.out.println("reached here2");
	   getlogin();
	   InteractionsPage ip=new InteractionsPage(driver);
	   ip.getinteractionlink().click();
	   
   }
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
}
