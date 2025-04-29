package Utilis;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.velocity.texen.util.FileUtil;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class utilityClass {

		// TODO Auto-generated method stub
		public static WebDriver driver;
		public static ExtentReports reports;
		public static ExtentTest test;
		public  String testname,testdescription,testcategory,testAuthor;
		public JavascriptExecutor js= (JavascriptExecutor) driver;
		public Actions action;
		public WebDriver wait;
		public  String sheetname;
		//String HomepageURL="https://www.demoblaze.com/index.html";
				
		public void browserlaunch(String browser, String URL)
		{
		if(browser.equalsIgnoreCase("chrome"))
		{
		driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver= new FirefoxDriver();			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(URL);
		}
		
		public void browserClose()
		{
			driver.close();
		}
	
		public static String[][] readExcel(String sheetname) throws IOException
		{
			XSSFWorkbook workbook =new XSSFWorkbook("C:\\Users\\ACER\\eclipse-workspace\\AdactinHotel\\src\\test\\resources\\Testdatafile\\Test Data file.xlsx");
			XSSFSheet sheet=workbook.getSheet(sheetname);
			int rowcount= sheet.getLastRowNum();
			int columncount=sheet.getRow(0).getLastCellNum();
			String[][] data=new String[rowcount][columncount]; 
			for(int i=1;i<=rowcount;i++)
			{
				XSSFRow row=sheet.getRow(i);
				for(int j=0;j<columncount;j++)
				{
					XSSFCell cell = row.getCell(j);
					
					if(cell == null) {
						data[i-1][j]=" ";
						System.out.println(cell.getStringCellValue());
					} else {
					data[i-1][j]=cell.getStringCellValue();
					System.out.println(cell.getStringCellValue());
				}}
				
			}
			workbook.close();
			return data;
			
		}
		
		public static String Screenshot(String name) throws IOException
		{
			String timestamp=new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
			String path="C:\\Users\\ACER\\eclipse-workspace\\AdactinHotel\\src\\test\\resources\\snap"+name+timestamp+".png";
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File des=new File(path);
			FileUtils.copyFile(src, des);
			return path;
				
		} 
}
