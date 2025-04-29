package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.myProjectSpecificCode;

public class bookingConfirmation extends myProjectSpecificCode
{
	public bookingConfirmation(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="search_hotel")
	WebElement searchhotelbutton;
	@FindBy(id="my_itinerary")
	WebElement myitineararybutton;
	@FindBy(id="logout")
	WebElement logoutbutton;
	public bookeditinerary clickingonmyitinerary()
	{
		myitineararybutton.click();
		return new bookeditinerary(driver);
		
	}

}
