package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.myProjectSpecificCode;

public class signup extends myProjectSpecificCode 
{
	public signup(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(id="username")
WebElement usernamefield;
@FindBy(id="password")
WebElement passwordfield;
@FindBy(id="re_password")
WebElement confirmpasswordfield;
@FindBy(id="full_name")
WebElement fullnamefield;
@FindBy(id="email_add")
WebElement emailaddressfield;
@FindBy(id="tnc_box")
WebElement Termsandconditioncheckbox;
@FindBy(id="Submit")
WebElement submit;
@FindBy(id="Reset")
WebElement reset;
@FindBy(xpath="//a[text()='New User Register Here']")
WebElement newusersignup;


public login clickingonsignup(String username,String password,String confirmpassword,String fullname,String emailaddress,String testtype,String expectedmessage)
{
	newusersignup.click();
	usernamefield.sendKeys(username);
	passwordfield.sendKeys(password);
	confirmpasswordfield.sendKeys(confirmpassword);
	fullnamefield.sendKeys(fullname);
	emailaddressfield.sendKeys(emailaddress);
	Termsandconditioncheckbox.click();
	submit.click();
	return new login(driver);
	
}
}
