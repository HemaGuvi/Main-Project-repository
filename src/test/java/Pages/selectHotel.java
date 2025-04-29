package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.myProjectSpecificCode;

public class selectHotel extends myProjectSpecificCode
{
	public selectHotel(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="cancel")
	WebElement cancelbutton;
	@FindBy(id="continue")
	WebElement continuebutton;
	@FindBy(id="radiobutton_span")
	WebElement errormsg;
	@FindBy(xpath="//input[@id='radiobutton_1']")
	WebElement radibutton1;
	@FindBy(xpath="//input[@id='radiobutton_2']")
	WebElement radibutton2;
	@FindBy(xpath="//input[@id='radiobutton_3']")
	WebElement radibutton3;
	@FindBy(xpath="//input[@id='radiobutton_4']")
	WebElement radibutton4;
	@FindBy(id="hotel_name_0")
	WebElement hotelnamefield;
	@FindBy(id="location_0")
	WebElement locationfield;
	@FindBy(id="rooms_0")
	WebElement roomsfield;
	@FindBy(id="arr_date_0")
	WebElement Arrivaldatefield;
	@FindBy(id="dep_date_0")
	WebElement departuredate;
	@FindBy(id="no_days_0")
	WebElement numberofdaysfield;
	@FindBy(id="room_type_0")
	WebElement roomtypefield;
	@FindBy(id="price_night_0")
	WebElement pricepernightfield;
	@FindBy(id="total_price_0")
	WebElement Totalpricefield;
	
	public searchHotel clickingOnCancelButton()
	{
		cancelbutton.click();
		return new searchHotel(driver);
		
	}
	public selectHotel clickingOnContinueButton()
	{
		continuebutton.click();
		Assert.assertTrue((errormsg).isDisplayed());
		return this;
	}
	public bookHotel selectinghotel(String radiobuttonselection)
	{
	WebElement element=	driver.findElement(By.xpath(radiobuttonselection));
	element.click();
	continuebutton.click();
	return new bookHotel(driver);
	}
		
	

}
