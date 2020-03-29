package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobjects.HomePage;
import Pageobjects.SwitchtoPage;
import Pageobjects.framePage;
import resourses.base;

public class TC_Frames_001 extends base
{

	@BeforeTest
	public void initalise() throws IOException
	{
		driver=initialiseDriver();
		
	}
	@Test
	public void framechecking()
	{
		driver.get(prop.getProperty("url"));
        HomePage hp=new HomePage(driver);
	    hp.getEmail().sendKeys("testing4hobby@gmail.com");
	    hp.getEnterbtn().click();
	    framePage fp=new framePage(driver);
        fp.getswitchtolink().click();
        fp.framelink().click();
//		driver.get("http://demo.automationtesting.in/Frames.html");
//		driver.switchTo().frame("SingleFrame");
//		fp.getText().sendKeys("jhsjkdfhjk");
//		driver.switchTo().defaultContent();
//		fp.getFrame().click();
//		driver.switchTo().frame(1);
//		driver.switchTo().frame(0);
//		fp.gerSframe().sendKeys("sdfsdfsdhgh");
//		WindowsPage wp=new WindowsPage(driver);
//		driver.get("http://demo.automationtesting.in/Windows.html");
//		wp.getnewTabbedWindow().click();
//		driver.close();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
