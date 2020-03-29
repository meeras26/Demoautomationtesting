package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoadingprogreebarPage {
	public WebDriver driver;
	public  LoadingprogreebarPage (WebDriver driver2)
	 {
		// TODO Auto-generated constructor stub
		 this.driver=driver2;
	 } 
    By btn=By.id("cricle-btn");
	public WebElement getbar()
	{
		return driver.findElement(btn);
		
	}
}
