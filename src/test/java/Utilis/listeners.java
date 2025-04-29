package Utilis;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import Base.myProjectSpecificCode;

public class listeners extends myProjectSpecificCode implements ITestListener{
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		 	test.log(Status.PASS,"Testcase Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Error:"+result.getThrowable());
	String screenShot ="";
	try {
	 screenShot=Screenshot(result.getMethod().getMethodName());
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	test.addScreenCaptureFromPath(screenShot, "Failure screenshot");
}}
