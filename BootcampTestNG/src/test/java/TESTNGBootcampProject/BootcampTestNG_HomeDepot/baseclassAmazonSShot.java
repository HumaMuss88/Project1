package TESTNGBootcampProject.BootcampTestNG_HomeDepot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class baseclassAmazonSShot {
	
public static WebDriver driver;
//	
//	@BeforeMethod
//	  @Parameters({"brow"})
//	  public void beforeMethod(String brow) throws InterruptedException, IOException {
//		  System.out.println("This is before test, we will open browser here");
//		  
//		  
//		  String browser= brow;

	
	/*  @BeforeMethod
	  public void beforeTest() throws InterruptedException, IOException {
	  
	  
	   System.out.print("This is before Test");
	   
	   
	  
		  String browser= "Chrome";*/
		  
//		  if(browser.contains("Chrome")) 
//		  { 
//
//		  System.setProperty("webdriver.chrome.driver","C:\\Users\\fiza_\\eclipse-workspace\\humamaven1\\Drivers\\chromedriver.exe");
//		  driver = new ChromeDriver();    // Opening chrome broser
//		  }
//		  
//		  else if (browser.contains("Firefox"))
//		  {
//		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\fiza_\\eclipse-workspace\\humamaven1\\Drivers\\geckodriver.exe");   
//		  driver = new FirefoxDriver();
//		  }
//		  
//		  else
//		  {
//			  System.setProperty("webdriver.edge.driver","C:\\Users\\fiza_\\eclipse-workspace\\humamaven1\\Drivers\\msedgedriver.exe");   
//		  driver = new EdgeDriver();
//		  }
@BeforeTest
public void beforeTest() throws InterruptedException, IOException {
	  System.out.println("This is before test, we will open browser here");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\fiza_\\eclipse-workspace\\humamaven1\\Drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.amazon.com/");
    driver.manage().window().maximize();
    
Thread.sleep(5000);
shots_withdate();

//driver.get("https://www.facebook.com/");
//	        driver.manage().window().maximize();
//	        Thread.sleep(5000);
//	        shots_withdate();
//	        Thread.sleep(5000);
	  
	        
	     /* System.out.print("This is before Test");
			  System.setProperty("webdriver.gecko.driver","C:\\Users\\fiza_\\eclipse-workspace\\humamaven1\\Drivers\\geckodriver.exe");
		        driver = new FirefoxDriver();
		        driver.get("https://www.facebook.com/");
		        driver.manage().window().maximize();
		        
		       System.out.print("This is before Test");
				  System.setProperty("webdriver.edge.driver","C:\\Users\\fiza_\\eclipse-workspace\\humamaven1\\Drivers\\msedgedriver.exe");
			        driver = new EdgeDriver();
			        driver.get("https://www.facebook.com/");
			        driver.manage().window().maximize();*/
	        
	    
	        
	        Thread.sleep(5000);
	  
	
	  }
		  @AfterMethod
		  public void afterTest() {
			  System.out.println("This is after test");
			 
			  driver.close();
			
		  }
		  public void shots() throws IOException {
			  File cap=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			  FileHandler.copy(cap, new File("C:\\Users\\fiza_\\eclipse-workspace\\BootcampTestNG\\src\\test\\java\\TESTNGBootcampProject\\BootcampTestNG_HomeDepot\\BootcampSS.png"));

		  }
		  public void shots_withargs(String name) throws IOException {
			  File cap=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			  FileHandler.copy(cap, new File("C:\\Users\\fiza_\\eclipse-workspace\\BootcampTestNG\\src\\test\\java\\TESTNGBootcampProject\\BootcampTestNG_HomeDepot\\BootcampSS\\"+name+".png"));
		  }
		  
		  public void shots_withdate() throws IOException {
			  Date dt=new Date();
			  String name_dt= dt.toString().replace(" ","_").replace(":","_");
			  File cap=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			  FileHandler.copy(cap, new File("C:\\Users\\fiza_\\eclipse-workspace\\BootcampTestNG\\src\\test\\java\\TESTNGBootcampProject\\BootcampTestNG_HomeDepot\\BootcampSS\\"+name_dt+".png"));
	}

}
