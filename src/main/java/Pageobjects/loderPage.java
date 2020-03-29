package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loderPage {
	public WebDriver driver;
	public  loderPage(WebDriver driver2)
	 {
		// TODO Auto-generated constructor stub
		 this.driver=driver2;
	 } 
     By btn=By.id("loader");
     
     By closebtn=By.cssSelector("button[class='btn btn-primary']");
//    WebDriverWait wait=new WebDriverWait(driver, 60);
//    wait.until(ExpectedConditions.)
	public WebElement getRunbtn()
	{
		return driver.findElement(btn);
		
	}
	public WebElement getClosebtn()
	{
		return driver.findElement(closebtn);
	}
}
