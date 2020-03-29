package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ResizeelementPage {
	public WebDriver driver;
	public ResizeelementPage(WebDriver driver2)
	{
		// TODO Auto-generated constructor stub
		 this.driver = driver2;
	}
	public void getResizeelement()

	{
		WebElement elt=driver.findElement(By.cssSelector("div[class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Actions act=new Actions(driver);
		act.clickAndHold(elt).moveByOffset(80,80 ).release().build().perform();
	}
}
