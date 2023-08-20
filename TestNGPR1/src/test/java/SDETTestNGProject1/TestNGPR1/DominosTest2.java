package SDETTestNGProject1.TestNGPR1;

import org.testng.annotations.Test;
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

public class DominosTest2 {
	public static WebDriver driver;
	
	  @BeforeTest
	  public void beforeTest() throws InterruptedException 
	  
	  
	  {
		  System.out.print("This is before Test");
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\fiza_\\eclipse-workspace\\humamaven1\\Drivers\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://www.dominos.com/");
	        driver.manage().window().maximize();
	        
	    
	        
	        Thread.sleep(5000);
	  }
	
	 
	
	
  @Test (priority=1)
  public void orderonline() throws InterruptedException {
  System.out.println("This is first test");
  DominosPOM2 ob=new DominosPOM2 (driver);
	  ob.orderonlineClick();
	  
	 Thread.sleep(5000); 
	 
  }
  
  @Test (priority=2)
  public void delivery() throws InterruptedException {
	  System.out.println("This is second test");
	  DominosPOM2 ob=new DominosPOM2 (driver);
 ob.deliveryClick();
 Thread.sleep(5000);
	  
  }
	  
  @Test (priority=3)
  public void AdressType() throws InterruptedException {
	  System.out.println("This is third test");
	  DominosPOM2 ob=new DominosPOM2 (driver);
	  ob.AdressTypeSelect();
	  Thread.sleep(50000);
	  
  }
 
  @Test (priority=4)
  public void Street() throws InterruptedException {
	  System.out.println("This is fourth test");
	  DominosPOM2 ob=new DominosPOM2 (driver);
  ob.StreetSend();

  Thread.sleep(5000);
  }


  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test");
	 
	  driver.close();
	
  }

}
