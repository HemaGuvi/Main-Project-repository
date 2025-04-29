package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Utilis.utilityClass;

public class myProjectSpecificCode extends utilityClass {
	@BeforeSuite
	public void Reportgeneration() {
		ExtentSparkReporter extent = new ExtentSparkReporter(
				"C:\\Users\\ACER\\eclipse-workspace\\AdactinHotel\\src\\test\\resources\\Report\\ExecutionReport.html");
		reports = new ExtentReports();
		reports.attachReporter(extent);
	}

	@BeforeMethod
	public void myBrowserLaunch() {
		browserlaunch("chrome", "https://adactinhotelapp.com/index.php");

	}
	@DataProvider
	public String[][] readexceldata() throws IOException
	{
		String[][] data = readExcel(sheetname);	
		return data;
	}

	@AfterMethod
	public void myBrowserClose() {
		browserClose();
	}

	@BeforeClass
	public void testDetails() {
		test = reports.createTest(testname, testdescription);
		test.assignCategory(testcategory);
		test.assignAuthor(testAuthor);

	}

	@AfterSuite
	public void reportclose() {
		reports.flush();
	}

}
