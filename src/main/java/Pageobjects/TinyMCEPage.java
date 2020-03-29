package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TinyMCEPage{
	 public WebDriver driver;
		public TinyMCEPage (WebDriver driver2)
		 {
			// TODO Auto-generated constructor stub
			 this.driver=driver2;
		 } 
       By frameid=By.id("mce_0_ifr");
       By bodyid=By.id("tinymce");
       public void getTinyMCE()
           {
    	    driver.findElement(frameid);
    	    driver.switchTo().frame("mce_0_ifr");
    	    driver.findElement(bodyid).sendKeys("sdfsdfewqew");
    	   
    	   }
}
