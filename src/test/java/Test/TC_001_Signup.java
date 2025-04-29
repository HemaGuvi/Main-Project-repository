package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.myProjectSpecificCode;
import Pages.login;
import Pages.signup;

public class TC_001_Signup extends myProjectSpecificCode {
	
		@BeforeTest	
		public void valuesetup() {
			sheetname="signup";
			testname="signup Test";
			testdescription="Testing the signup option with valid and invalid credentials";
			testcategory="Smoke Testing";
			testAuthor="Hemavathy Rajendran";
	}
		@Test(dataProvider="readexceldata")
		public void loginexecution(String username,String pwd,String confirmpassword,String fullname,String email,String testtype,String expectedmessage)
		{
			Pages.signup signupobject=new signup(driver);
			signupobject.clickingonsignup(username,pwd,confirmpassword,fullname,email,testtype,expectedmessage);
			
		}
}
