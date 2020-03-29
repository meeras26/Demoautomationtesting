package Pageobjects;




import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.google.common.base.Strings;

public class WebTable 
{
	 public WebDriver driver;
		public WebTable (WebDriver driver2)
		 {
			// TODO Auto-generated constructor stub
			 this.driver=driver2;
		 } 
		By email=By.cssSelector("#\\31 578900201040-0-uiGrid-0005-cell > div:nth-child(1)");
		By editpencil=By.cssSelector("#\\31 578901683013-0-uiGrid-000B-cell > user-click-select:nth-child(1) > div:nth-child(1) > button:nth-child(1) > i:nth-child(1)");
		
		public void getemail()
		{
			List<WebElement>allEmails=driver.findElements(email);
			List<String>emailids= new ArrayList<String>();
		
			for (WebElement email:allEmails)
			{
				emailids.add(email.getText());
				
			}
			for(String Email:emailids)
			{
				System.out.println(Email);
			}
			if(emailids.contains("vtsekov@yahoo.com"))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("fail");
			}
			
		
		}
//		public WebElement getEdit()
//		{
//			
//			Actions act=new Actions(driver);
//			
//			act.moveToElement(editpencil.doubleClick().build().perform();
//      		return driver.findElement(editpencil);
//			
//		}

}
