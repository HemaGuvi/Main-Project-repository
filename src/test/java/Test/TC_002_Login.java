package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.myProjectSpecificCode;
import Pages.login;

public class TC_002_Login extends myProjectSpecificCode 
{
	@BeforeTest	
	public void valuesetup() {
		sheetname="login";
		testname="login Test";
		testdescription="Testing the login option with valid and invalid credentials";
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

}
}
