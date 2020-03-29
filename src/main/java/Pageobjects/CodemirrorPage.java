package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CodemirrorPage {
	 public WebDriver driver;
		public CodemirrorPage  (WebDriver driver2)
		 {
			// TODO Auto-generated constructor stub
			 this.driver=driver2;
		 } 
  By text=By.cssSelector("div[class='CodeMirror cm-s-default']");
  
  public WebElement gettextArea()
  {   System.out.println(text);
  
 
	  return driver.findElement(text);
	
  }
}
