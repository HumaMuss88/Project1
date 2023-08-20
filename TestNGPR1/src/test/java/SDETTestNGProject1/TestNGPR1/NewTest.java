package SDETTestNGProject1.TestNGPR1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public static WebDriver driver;
	
	  @BeforeTest
	  public void beforeTest() throws InterruptedException 
	  
	  
	  {
		  System.out.print("This is before Test");
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\fiza_\\eclipse-workspace\\humamaven1\\Drivers\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        driver.manage().window().maximize();
	        
	    
	        
	        Thread.sleep(5000);
	  }
	
	  @Test
	  public void fbtextTestCase() throws InterruptedException {
		  System.out.println("This is first test");
		  HomePOM ob=new HomePOM (driver);
		  ob.getfbText();
		  
		  Thread.sleep(5000);
	  }
	
	
 // @Test
  //public void backtoschool() throws InterruptedException {
	//  System.out.println("This is first test");
//	  HomePOM ob=new HomePOM (driver);
//	  ob.backtoschoolClick();
	  
	// Thread.sleep(5000);
 // }
 // @Test
 // public void offcollege() throws InterruptedException {
//	  System.out.println("This is second test");
	//  HomePOM ob=new HomePOM (driver);
	// ob.offcollegeClick();
	  
	  
	//  Thread.sleep(5000);
 // }


  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test");
	 
	  driver.close();
	
  }

}
