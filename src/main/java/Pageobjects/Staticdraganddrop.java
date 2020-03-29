package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Staticdraganddrop {
	public WebDriver driver;
	public Staticdraganddrop(WebDriver driver2)
	{
		// TODO Auto-generated constructor stub
		 this.driver = driver2;
	}
By interaction = By.cssSelector("a[href='Interactions.html']");

   public WebElement getInteraction()
   
   {
	   return driver.findElement(interaction);
   }
   
   public void getDragnddrop()

   {
	 //Sub Menu
	   WebElement subMenu = driver.findElement(By.cssSelector("ul[class='dropdown-menu'] a[data-toggle='dropdown']"));
	   Actions actions = new Actions(driver);
	   //To mouseover on sub menu
	   actions.moveToElement(subMenu);
	   //build() method is used to compil
	   actions.click().build().perform();
   
   }
   
   public void getStatic()
   {
	   WebElement subMenu = driver.findElement(By.cssSelector("a[href='Static.html']"));
	   Actions actions = new Actions(driver);
	   //To mouseover on sub menu
	   actions.moveToElement(subMenu);
	   //build() method is used to compil
	   actions.click().build().perform(); 
   }
   public void performDragandDrop()
   {
	   WebElement sourceLocator = driver.findElement(By.id("angular"));
       //To get target locator
	   WebElement targetLocator = driver.findElement(By.id("droparea"));
       //dragAndDrop(source, target) method accepts two parameters source and locator. 
       //used dragAndDrop method to drag and drop the source locator to target locator
//	   System.out.println(sourceLocator);
//	   System.out.println(targetLocator);
	   Actions action = new Actions(driver);
	   System.out.println(driver);
	   action.dragAndDrop(sourceLocator, targetLocator).build().perform();
   }
}
