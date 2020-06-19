package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Widgets_page {
	public WebDriver driver;
	public Widgets_page (WebDriver driver2)
	 {
		// TODO Auto-generated constructor stub
		 this.driver=driver2;
	 } 
        By widgetlink=By.cssSelector("a[href='Widgets.html']");
        By autocompltelink=By.cssSelector("a[href='AutoComplete.html']");
        By datepick=By.cssSelector("a[href='Datepicker.html']");
        public WebElement getWidgetliink()
        {
        	return driver.findElement(widgetlink);
        			
        }
        public WebElement getautocompltelink()
        {
        	return driver.findElement(autocompltelink);
        }
        public WebElement getdatepickerlink()
        {
        	return driver.findElement(datepick);
        }
}
