package Pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SwitchtoPage 
{
	 public WebDriver driver;
		public SwitchtoPage (WebDriver driver2)
		 {
			// TODO Auto-generated constructor stub
			 this.driver=driver2;
		 } 
		By switchlink=By.cssSelector("a[href='SwitchTo.html']");
		By alertlink=By.linkText("Alerts");
		By clikredbtn=By.id("OKTab");
		By okandcancel=By.cssSelector("a[href='#CancelTab']");
		By dispalybox=By.id("CancelTab");
		By textb=By.cssSelector("a[href='#Textbox']");
		By promptbtn=By.id("Textbox");
		public WebElement getswitchtolink()
		{
			return driver.findElement( switchlink);
		}
        public WebElement getAlertlink()
		{
        	return driver.findElement( alertlink);
			
		}
		public WebElement getbtn()
		{
			return driver.findElement(clikredbtn);
			
		}
		public WebElement getok()
		{
			return driver.findElement(okandcancel);
			
		}
		public WebElement getOkCancel()
		{
			return driver.findElement(dispalybox);
		}
		public WebElement getalTextbox()
		{
			return driver.findElement(textb);
		}
		public WebElement getPrompt()
		{
			return driver.findElement(promptbtn);
		}

}
