package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutocompletePage {

	public WebDriver driver;
	public  AutocompletePage(WebDriver driver2)
	 {
		// TODO Auto-generated constructor stub
		 this.driver=driver2;
	 } 
	By  text=By.id("searchbox");
	public WebElement getAutocompletebox()
	{
		return driver.findElement(text);
	}
}
