package Pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatepickerPage 
{
	public WebDriver driver;
	public  DatepickerPage(WebDriver driver2)
	 {
		// TODO Auto-generated constructor stub
		 this.driver=driver2;
	 } 
//	Date picker Disabled
	By calnder=By.id("datepicker1");
	By dates=By.cssSelector("td[data-handler='selectDay']");
	By month=By.cssSelector("div[class='ui-datepicker-title']");
	By btn=By.cssSelector("a[data-handler='next']");
	public WebElement getCalander()
	{
		return driver.findElement(calnder);
	}
	 public void getMonth()
	 {
		 while(!driver.findElement(month).getText().contains("April"))
		 {
			 driver.findElement(btn).click();
		 }
//		 while(driver.findElement(month));
	 }
	 public void getDates()
	 {
		 List<WebElement> dy= driver.findElements(dates);
		 int count=driver.findElements(dates).size();
		 for(int i=0;i<count;i++)
		 {
			 String text=driver.findElements(dates).get(i).getText();
			 if(text.equals("23"))
			 {
				 driver.findElements(dates).get(i).click();
				 break;
			 }
		 }
	 }
	 
	
	

}
