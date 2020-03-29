package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage 
{
 public WebDriver driver;
 
 public HomePage(WebDriver driver2)
 {
	// TODO Auto-generated constructor stub
	 this.driver=driver2;
 }
 By mail=By.id("email");
 By enter=By.id("enterimg");
 public WebElement getEmail()
 {
	 return driver.findElement(mail);
 }
 public WebElement getEnterbtn()
 {
	 return driver.findElement(enter);
 }
}
