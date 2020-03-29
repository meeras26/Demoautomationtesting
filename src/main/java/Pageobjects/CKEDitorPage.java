package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CKEDitorPage {
	 public WebDriver driver;
		public CKEDitorPage (WebDriver driver2)
		 {
			// TODO Auto-generated constructor stub
			 this.driver=driver2;
		 } 
		By frameid=By.className("cke_wysiwyg_frame cke_reset");
		By framebdy=By.id("cke_1_contents");
		public void getEditor()

		{
			driver.switchTo().frame(0);
			driver.findElement(framebdy).sendKeys("qqqqqqqqq");
		}
}
