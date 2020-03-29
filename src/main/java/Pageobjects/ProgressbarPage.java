package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProgressbarPage
{
	public WebDriver driver;
	public  ProgressbarPage(WebDriver driver2)
	 {
		// TODO Auto-generated constructor stub
		 this.driver=driver2;
	 } 
	By btn = By.id("downloadButton");
	By close=By.xpath("//div[@class='ui-dialog-buttonset']");
	public WebElement getbutton()
	
	{
		return driver.findElement(btn);
		
	}
	public WebElement getClosebtn()
	{
		return driver.findElement(close);
	}
}
