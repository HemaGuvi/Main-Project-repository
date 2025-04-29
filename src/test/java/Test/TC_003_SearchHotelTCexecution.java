package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.myProjectSpecificCode;
import Pages.login;
import Pages.searchHotel;

	public class TC_003_SearchHotelTCexecution extends myProjectSpecificCode 
	{
		@BeforeTest	
		public void valuesetup() 
		{
			sheetname="search hotel";
			testname="Search Hotel Test";
			testdescription="Testing the search hotel functionality";
			testcategory="Smoke Testing";
			testAuthor="Hemavathy Rajendran";
		}
		@Test(dataProvider="readexceldata")
		public void searchHotelExecution(String location,String hotels,String roomtype,String noofrooms,String checkindate,String checkoutdate,String Adultperroom,String childrenperroom,String testtype,String expectedmessage)
		{
			Pages.login loginobject=new login(driver);
			loginobject.enterusername("HemavathyAravind")
			.enterpassword("Test@123")
			.clickinglogin();
			Pages.searchHotel searchHotelobject=new searchHotel(driver);
			searchHotelobject.enteringallfieldsandclickonsearch(location,hotels,roomtype,noofrooms,checkindate,checkoutdate,Adultperroom,childrenperroom,testtype,expectedmessage);
		}
	}
