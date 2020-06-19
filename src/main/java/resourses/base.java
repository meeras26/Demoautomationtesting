package resourses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pageobjects.HomePage;

import org.apache.commons.io.FileUtils;



public class base {
	public static WebDriver driver;
	public Properties prop;
	 public WebDriver initialiseDriver() throws IOException
	 {
		 prop= new  Properties();
		 FileInputStream fis= new FileInputStream("D:\\Gitproject\\Demoautomationtesting\\src\\main\\java\\resourses\\data.Properties");
		 prop.load(fis);
		 String Browsername=prop.getProperty("browser");
		 if(Browsername.equals("chrome"))
		 {
				System.setProperty("webdriver.chrome.driver","F:\\\\mygitfolder\\\\chromedriver.exe");
				 driver=new ChromeDriver();
				 
		 }
		 else if(Browsername.equals("firefox"))
		 {
			 System.setProperty("webdriver.gecko.driver","D:\\Drivers\\geckodriver.exe"); 
			 driver=new FirefoxDriver();
		 }
		 
		
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         return driver;
		
	 }
	 public void getlogin()
	 {
		 driver.get(prop.getProperty("url"));
			
	       HomePage hp=new HomePage(driver);
	       hp.getEmail().sendKeys("testing4hobby@gmail.com");
	       hp.getEnterbtn().click();
	 }
	public void getScreenshot(String result) throws IOException
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D://demoautomationscreenshots//"+result+"screen.png"));
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src,new File("D://demoautomationscreenshots//screen.png"));
	}
	

}
