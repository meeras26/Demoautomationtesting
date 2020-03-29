package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadPage {
	 public WebDriver driver;
	 public  FileUploadPage (WebDriver driver2)
		 {
			// TODO Auto-generated constructor stub
			 this.driver=driver2;
		 }
	 By btn=By.id("input-4");
	 By sumt=By.cssSelector("button[title='Upload selected files']");
	 public WebElement getimage()

     {
		return driver.findElement(btn);
		 }
	 public WebElement getSubmition()
	 {
		 return driver.findElement(sumt);
	 }
}
