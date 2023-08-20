package SDETTestNGProject1.TestNGPR1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class FBTest4 extends baseclass {
	

		 
		 
	
  @Test (priority=1)
  public void enterEmailtest() throws InterruptedException, IOException {
  System.out.println("This is first test");
  FBPOM4 ob=new FBPOM4 (driver);
	  ob.enterEmail("abc@yahoo.com");
	  
	 Thread.sleep(5000); 
	 ob.enterPass("bhhhhhh");
	 shots_withdate();
	  Thread.sleep(5000);

  }
  
 /* @Test (priority=2)
  public void enterEmailtest2() throws InterruptedException {
  System.out.println("This is second test");
  FBPOM4 ob=new FBPOM4 (driver);
	  ob.enterEmail("dif@yahoo.com");
	  
	 Thread.sleep(5000); 
	 ob.enterPass("vhhhhhh");
	  Thread.sleep(5000);

	  
  }*/
	  
  

  
}