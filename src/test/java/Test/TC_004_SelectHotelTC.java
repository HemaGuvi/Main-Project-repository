package Test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.myProjectSpecificCode;
import Pages.login;
import Pages.searchHotel;
import Pages.selectHotel;

public class TC_004_SelectHotelTC extends myProjectSpecificCode{

	
	@BeforeTest	
	public void valuesetup() 
	{
		sheetname="select hotel";
		testname="select Hotel Test";
		testdescription="Testing the select hotel functionality";
		testcategory="Smoke Testing";
		testAuthor="Hemavathy Rajendran";
	}
	@Test(dataProvider="readexceldata")
	public void selectHotelExecution(String username,String password,String location,String hotels,String roomtype,String noofrooms,String checkindate,String checkoutdate,String Adultperroom,String childrenperroom,String radioselection,String testtype,String expectedmessage)
	{
		Pages.login loginobject=new login(driver);
		loginobject.enterusername(username)
		.enterpassword(password)
		.clickinglogin();
		Pages.searchHotel searchHotelobject=new searchHotel(driver);
		searchHotelobject.enteringallfieldsandclickonsearch(location,hotels,roomtype,noofrooms,checkindate,checkoutdate,Adultperroom,childrenperroom,testtype,expectedmessage);
		Pages.selectHotel selecthotelobject=new selectHotel(driver);
		selecthotelobject.selectinghotel(radioselection);
	
	}
}

