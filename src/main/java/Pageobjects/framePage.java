package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class framePage 
{
	public WebDriver driver;
	public  framePage(WebDriver driver2)
	 {
		// TODO Auto-generated constructor stub
		 this.driver=driver2;
	 } 
	By switchlink=By.cssSelector("a[href='SwitchTo.html']");
	By framelink=By.linkText("Frames");
	By text=By.cssSelector("input[type='text']");
	By withinframe=By.cssSelector("a[href='#Multiple']");
	By ftext=By.cssSelector("input[type='text']");
	
	public WebElement getswitchtolink()
	{
		return driver.findElement( switchlink);
	}
	public WebElement framelink()
	{
		return driver.findElement(framelink);
	}
	public WebElement getText()
	{
		return driver.findElement(text);
	}
	public WebElement getFrame()
	{
		return driver.findElement(withinframe);
	}
	public WebElement gerSframe()
	{
		return driver.findElement(ftext);
	}

}
