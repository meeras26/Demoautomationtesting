package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowsPage {

	public WebDriver driver;
	public  WindowsPage(WebDriver driver2)
	 {
		// TODO Auto-generated constructor stub
		 this.driver=driver2;
	 } 
	By btn=By.cssSelector("a[href='http://www.sakinalium.in']");
	By sbtn=By.cssSelector("a[href='#Seperate']");
	public WebElement getnewTabbedWindow()
	
	{
		return driver.findElement(btn);
	}
	public WebElement getNewseparatewindow()
	{
		return driver.findElement(sbtn);
	}
}
