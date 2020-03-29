package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicdataPage {
	 public WebDriver driver;
		public DynamicdataPage (WebDriver driver2)
		 {
			// TODO Auto-generated constructor stub
			 this.driver=driver2;
		 }
By btn=By.id("save");
   public WebElement getButton()
   {
	return driver.findElement(btn);

   }
}