package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FiledownloadPage {
	 public WebDriver driver;
	 public  FiledownloadPage(WebDriver driver2)
		 {
			// TODO Auto-generated constructor stub
			 this.driver=driver2;
		 }
	 By text=By.id("textbox");
	 By gnerte=By.id("createTxt");
	 By downlink=By.id("link-to-download");
	 public WebElement getTextarea()
	 {
		  return driver.findElement(text);
	 }
	 public WebElement getGeneratebtn()

	 {
		 return driver.findElement(gnerte);
	 }
	 public WebElement getDownloadlink()
	 {
		return driver.findElement(downlink);
		 
	 }
}
