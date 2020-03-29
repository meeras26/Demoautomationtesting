package Pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AccordianPage 
{
        public WebDriver driver;
		public AccordianPage(WebDriver driver2)
		 {
			// TODO Auto-generated constructor stub
			 this.driver=driver2;
		 } 
		By Widgets=By.cssSelector("a[href='Widgets.html']");
		By accord=By.cssSelector("a[href='Accordion.html']");
	By reliability=By.cssSelector("a[href='#collapse1']");
		By linecoding=By.cssSelector("a[href='#collapse2']");
		By methodchainig=By.cssSelector("a[href='#collapse3']");
		By browsertest=By.cssSelector("a[href='#collapse4']");
	
		public WebElement clickWidgetlink()
		{
			return driver.findElement(Widgets);
		}
		public WebElement clickAccordianlink()
		{
			return driver.findElement(accord);
		}
		public WebElement getFirstCollapse()
		{
			return driver.findElement(reliability);
		}
		public WebElement getSecondCollapse()
        {
			return driver.findElement(methodchainig);
		}
		public WebElement getthirdCollapse()
        {
			return driver.findElement(browsertest);
		}
		public WebElement getforthCollapse()
        {
			return driver.findElement(browsertest);
		}
}

