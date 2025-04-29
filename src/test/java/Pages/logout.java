package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.myProjectSpecificCode;

public class logout extends myProjectSpecificCode 
{

	
	public logout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;
	
	public login logoutverification()
	{	
		logout.click();
		return new login(driver);
		
	}
	

}
