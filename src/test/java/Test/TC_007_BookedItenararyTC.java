package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.myProjectSpecificCode;
import Pages.bookHotel;
import Pages.bookeditinerary;
import Pages.bookingConfirmation;
import Pages.login;
import Pages.searchHotel;
import Pages.selectHotel;

public class TC_007_BookedItenararyTC extends myProjectSpecificCode {

	
	@BeforeTest	
	public void valuesetup() 
	{
		sheetname="book hotel";
		testname="book Hotel Test";
		testdescription="Testing the select hotel functionality";
		testcategory="Smoke Testing";
		testAuthor="Hemavathy Rajendran";
	}
	@Test(dataProvider="readexceldata")
	public void selectHotelExecution(String username,String password,String location,String hotels,String roomtype,String noofrooms,String checkindate,String checkoutdate,String Adultperroom,String childrenperroom,String radioselection,String firstname,String lastname,String billingaddress,String creditcardno,String creditcardtype,String expirymonth,String expiryyear,String cvv,String testtype,String expectedmessage) throws InterruptedException
	{
		Pages.login loginobject=new login(driver);
		loginobject.enterusername(username)
		.enterpassword(password)
		.clickinglogin();
		Pages.searchHotel searchHotelobject=new searchHotel(driver);
		searchHotelobject.enteringallfieldsandclickonsearch(location,hotels,roomtype,noofrooms,checkindate,checkoutdate,Adultperroom,childrenperroom,testtype,expectedmessage);
		Pages.selectHotel selecthotelobject=new selectHotel(driver);
		selecthotelobject.selectinghotel(radioselection);
		Pages.bookHotel bookhotelobject=new bookHotel(driver);
		bookhotelobject.bookinghotelbyfillingallfields(firstname,lastname,billingaddress,creditcardno,creditcardtype,expirymonth,expiryyear,cvv,testtype,expectedmessage);
		Pages.bookingConfirmation bookingconfirmationobject= new bookingConfirmation(driver);
		bookingconfirmationobject.clickingonmyitinerary();
		Pages.bookeditinerary bookeditineraryobject=new bookeditinerary(driver);
		bookeditineraryobject.searchfieldverification()
		.selectingitinerary()
		.cancelitinerary()
		.cancelbookingverification()
		.searchhotelbutton();
		
		
				
	}
}
