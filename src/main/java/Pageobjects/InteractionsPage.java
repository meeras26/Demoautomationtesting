package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InteractionsPage {
	public WebDriver driver;
	public InteractionsPage(WebDriver driver2)
	 {
		// TODO Auto-generated constructor stub
		 this.driver=driver2;
	 } 
	By interactionlink=By.cssSelector("a[href='Interactions.html']");
	By draganddroplink=By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/a");
			
	public WebElement getinteractionlink()
	{
		return driver.findElement(interactionlink);
	}
    public WebElement getdraganddroplink()
    {
    	return driver.findElement(draganddroplink);
    }
}
