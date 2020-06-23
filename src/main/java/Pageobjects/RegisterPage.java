package Pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage 
{  
	public WebDriver driver;
	public RegisterPage (WebDriver driver2)
	 {
		// TODO Auto-generated constructor stub
		 this.driver=driver2;
	 } 
	    By heading=By.tagName("h2");
		By Fname=By.cssSelector("input[ng-model='FirstName']");
		By Lname=By.cssSelector("input[ng-model='LastName']");
		//By Address=By.cssSelector("input[ng-model='Adress']");
		By Address=By.tagName("textarea");
		By email=By.cssSelector("input[ng-model='EmailAdress']");
		By phone=By.cssSelector("input[ng-model='Phone']");
		By radiobtn=By.cssSelector("input[value='Male']");
		By checkbx=By.id("checkbox1");
		By skills=By.id("Skills");
		By country=By.id("countries");
		By setcountry=By.id("select2-country-container");
		By doby=By.id("yearbox");
		By dobm=By.cssSelector("select[placeholder='Month']");
		By dobd=By.id("daybox");
		By fpassword=By.id("firstpassword");
		By cpassword=By.id("secondpassword");
		By submit=By.id("submitbtn");
//		By photo=By.id("imagesrc");
		By photo=By.cssSelector("input[type='file']");
		public WebElement getheading()
		{
			return driver.findElement(heading);
		}
		public WebElement getFirestname()
		{
			return driver.findElement(Fname);
			
		}
		public WebElement getLastname()
		{
			return driver.findElement(Lname);
		}
		public WebElement getAddress()
		{
			return driver.findElement(Address);
		}
		public WebElement getemail()
		
		{
			return driver.findElement(email);
		}
		public WebElement getPhone()
		{
			return driver.findElement(phone);
		}
		public WebElement getRadiobtn()
		{
			return driver.findElement(radiobtn);
		}
		public WebElement getCheckbox()
		{
			return driver.findElement(checkbx);
		}
		public Select getselectedoptn()
		{
			Select sel =new Select(driver.findElement(skills));
            return sel;
		}
		public Select getCountry()
		{
			Select sel =new Select(driver.findElement(country));
			return sel;
		}
		public void getselctctry()
		{
			List<WebElement>contrys=driver.findElements(setcountry);
			for(WebElement cutry:contrys)
			{
				if(cutry.getText().equals("India"))
				{
					cutry.click();
					break;
				}
			}
		} 
		public Select getdoby()
		{
			Select s=new Select(driver.findElement(doby));
			return s;
		} 
		public Select getdobm()
		{
			Select sm=new Select(driver.findElement(dobm));
			return sm;
		}
		public Select getdobd()
		{
			Select sd=new Select(driver.findElement(dobd));
			return sd;
		}
		public WebElement getFpassword()
		{
		   return driver.findElement(fpassword);
		}
		public WebElement getConpassword()
		{
			return driver.findElement(cpassword);
		}
		public WebElement getPhoto()
		{
			return driver.findElement(photo);
			
		}
		public WebElement getSubmit()
		{
			return driver.findElement(submit);
		}
		
}
