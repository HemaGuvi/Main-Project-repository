package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.myProjectSpecificCode;

public class login extends myProjectSpecificCode {

	
	public login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement usernamefield;
	@FindBy(id="password")
	WebElement passwordfield;
	@FindBy(id="login")
	WebElement loginbutton;
	public login enterusername(String username)
	{
		usernamefield.sendKeys(username);
		return this;
	}
	public login enterpassword(String pwd)
	{
		passwordfield.sendKeys(pwd);
		return this;
	}
	public searchHotel clickinglogin()
	{
		Assert.assertTrue((loginbutton).isDisplayed());
		loginbutton.click();		
		return new searchHotel(driver);
	}
	
	
	
}
