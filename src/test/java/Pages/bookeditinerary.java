package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.myProjectSpecificCode;

public class bookeditinerary extends myProjectSpecificCode{
	public bookeditinerary (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="check_all")
	WebElement checkbox;
	@FindBy(className="reg_button")
	WebElement cancelselectedbutton;
	@FindBy(id="logout")
	WebElement logoutbutton;
	@FindBy(id="search_hotel")
	WebElement searchhotelbutton;
	@FindBy(id="btn_id_1327207")
	WebElement cancelbooking;
	@FindBy(id="order_id_1327207")
	WebElement orderid;
	@FindBy(id="order_id_text")
	WebElement searchfield;
	@FindBy(id="search_hotel_id")
	WebElement gobutton;
	
	
	public bookeditinerary selectingitinerary()
	{
		checkbox.click();
		return this;
	}
	public bookeditinerary cancelitinerary()
	{
		cancelselectedbutton.click();
		Alert alertmsg =driver.switchTo().alert();
		alertmsg.accept();
		return this;
	}
	public bookeditinerary cancelbookingverification()
	{
		cancelbooking.click();
		Alert alertmsg =driver.switchTo().alert();
		alertmsg.accept();
		return this;
	}
	public bookeditinerary searchfieldverification()
	{
		String orderidvalue =orderid.getText();
		searchfield.sendKeys(orderidvalue);
		gobutton.click();
		return this;
		
	}
	public searchHotel searchhotelbutton()
	{
		searchhotelbutton.click();
		return new searchHotel(driver);
	}
	public login logout()
	{
		logoutbutton.click();
		return new login(driver); 
	}
}
