package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.myProjectSpecificCode;

public class menuitems extends myProjectSpecificCode
{
	public menuitems(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//td[text()='Welcome to Adactin Group of Hotels']")
	WebElement welcometext;
	@FindBy(id="username_show")
	WebElement hellomsg;
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	WebElement bookeditinerary;
	@FindBy(xpath="//a[text()='Change Password']")
	WebElement changepassword;
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;
	@FindBy(id="current_pass")
	WebElement currentpassword;
	@FindBy(id="new_password")
	WebElement newpassword;
	@FindBy(id="re_password")
	WebElement confirmpassword;
	@FindBy(id="Submit")
	WebElement submitbutton;
	
	public menuitems welcomemsg() 
	{
		Assert.assertTrue(welcometext.isDisplayed());
		return this;
		
	}

	public menuitems hellomsg() 
	{
		Assert.assertTrue(hellomsg.isDisplayed());
		return this;
	}
	public menuitems bookeditinerarycheck() 
	{
		Assert.assertTrue(bookeditinerary.isDisplayed());
		return this;
	}
	public menuitems changepassword() 
	{
		Assert.assertTrue(changepassword.isDisplayed());
		changepassword.click();
		currentpassword.sendKeys("Test@123");
		newpassword.sendKeys("Test@1234");
		confirmpassword.sendKeys("Test@1234");
		submitbutton.click();
		return this;
	}
	public menuitems logout() 
	{
		Assert.assertTrue(logout.isDisplayed());
		return this;
	}
}
