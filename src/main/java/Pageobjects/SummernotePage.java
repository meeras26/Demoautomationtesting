package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SummernotePage 
{
	 public WebDriver driver;
		public SummernotePage (WebDriver driver2)
		 {
			// TODO Auto-generated constructor stub
			 this.driver=driver2;
		 } 
		By note=By.cssSelector("div[class='note-editable panel-body']");
		public WebElement getSummernote()
		{
			return driver.findElement(note);
			
		}
}
