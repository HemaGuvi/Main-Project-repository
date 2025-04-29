package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.myProjectSpecificCode;

public class searchHotel extends myProjectSpecificCode
{
	public searchHotel(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	WebElement locationdropdown;
	@FindBy(id="hotels")
	WebElement hotelsdropdown;
	@FindBy(id="room_type")
	WebElement roomtypedropdown;
	@FindBy(id="room_nos")
	WebElement numberofroomsdropdown;
	@FindBy(id="datepick_in")
	WebElement checkinfield;
	@FindBy(id="datepick_out")
	WebElement checkoutfield;
	@FindBy(id="adult_room")
	WebElement adultsperroom;
	@FindBy(id="child_room")
	WebElement childperroom;
	@FindBy(id="Submit")
	WebElement Searchbutton;
	@FindBy(id="Reset")
	WebElement Resetbutton;
	@FindBy(xpath="//strong[text()='Hotel Name']")
	WebElement hotelnamefield;
	public selectHotel enteringallfieldsandclickonsearch(String location,String hotels,String roomtype,String noofrooms,String checkindate,String checkoutdate,String Adultperroom,String childrenperroom,String testtype,String expectedmessage)
	{
		locationdropdown.sendKeys(location);
		hotelsdropdown.sendKeys(hotels);
		roomtypedropdown.sendKeys(roomtype);
		numberofroomsdropdown.sendKeys(noofrooms);
		checkinfield.sendKeys(checkindate);
		checkoutfield.sendKeys(checkoutdate);
		adultsperroom.sendKeys(Adultperroom);
		childperroom.sendKeys(childrenperroom);
		Searchbutton.click();
		return new selectHotel(driver);
	}
	
	
	
}
