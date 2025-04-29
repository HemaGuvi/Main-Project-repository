package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.myProjectSpecificCode;
import Pages.login;
import Pages.menuitems;

public class TC_008_MenuitemsTC extends myProjectSpecificCode {
	@BeforeTest	
	public void valuesetup() {
		sheetname="login";
		testname="Menu items check";
		testdescription="Testing the menu items";
		testcategory="Smoke Testing";
		testAuthor="Hemavathy Rajendran";
}
	@Test(dataProvider="readexceldata")
	public void loginexecution(String username,String pwd,String testtype,String expectedmessage) 
	{
		Pages.login loginobject=new login(driver);
		loginobject.enterusername(username)
		.enterpassword(pwd)
		.clickinglogin();
		Pages.menuitems menuitemobject=new menuitems(driver);
		
		menuitemobject.welcomemsg()
		.hellomsg()
		.bookeditinerarycheck()
		.changepassword()
		.logout();
		

}}
