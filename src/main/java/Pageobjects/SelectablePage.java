package Pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectablePage {
	public WebDriver driver;
	public SelectablePage(WebDriver driver2)
	{
		// TODO Auto-generated constructor stub
		 this.driver = driver2;
	}

	By serialise=By.cssSelector("a[href='#Serialize']");
	 public WebElement getSerialseButton()

	 {
		return driver.findElement(serialise);
	 }
	 public void getlistofElement()
	 {
		 List<WebElement>elemnt = driver.findElements(By.cssSelector("li[class='ui-widget-content']"));
		 for(WebElement li:elemnt)
		 {
			 if(li.getText().equals("Sakinalium - Method Chaining"))
			 {
				 li.click();
				// System.out.println(li.getClass();
			 }
		 }
//		 List<WebElement>cl = driver.findElements(By.className("ui-widget-content"));
//		 for(WebElement li:cl)
//		 {
//			if(cl.contains("ui-widget-content selected"))
//			{
//			 System.out.println("selected");
//			}
//		 }
		 
	 }
}
