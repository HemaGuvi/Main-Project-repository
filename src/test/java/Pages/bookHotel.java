package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.myProjectSpecificCode;

public class bookHotel extends myProjectSpecificCode
{
public bookHotel(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(id="first_name")
WebElement firstnamefield;
@FindBy(id="last_name")
WebElement lastnamefield;
@FindBy(id="address")
WebElement billingaddressfield;
@FindBy(id="cc_num")
WebElement creditcardnumberfield;
@FindBy(id="cc_type")
WebElement creditcardTypefield;
@FindBy(id="cc_exp_month")
WebElement expirydate_month;
@FindBy(id="cc_exp_year")
WebElement expirydate_year;
@FindBy(id="cc_cvv")
WebElement cvvfield;
@FindBy(id="book_now")
WebElement booknowbutton;
@FindBy(id="cancel")
WebElement cancelbutton;
@FindBy(xpath="//a[text()='Back']")
WebElement back;


public selectHotel clickingonback()
{
	back.click();
	return new selectHotel(driver);
	
}
public bookingConfirmation bookinghotelbyfillingallfields(String firstname,String lastname,String BillingAddress,String Creditcardno,String creditcardtype,String Expirydatemonth,String Expirydateyear,String cvv,String Testtype,String Expectedmessage) throws InterruptedException
{
	
	firstnamefield.sendKeys(firstname);
	lastnamefield.sendKeys(lastname);
	billingaddressfield.sendKeys(BillingAddress);
	creditcardnumberfield.sendKeys(Creditcardno);
	creditcardTypefield.sendKeys(creditcardtype);
	expirydate_month.sendKeys(Expirydatemonth);
	expirydate_year.sendKeys(Expirydateyear);
	cvvfield.sendKeys(cvv);
	booknowbutton.click();
	Thread.sleep(5000);
	return new bookingConfirmation(driver);	
}

}
