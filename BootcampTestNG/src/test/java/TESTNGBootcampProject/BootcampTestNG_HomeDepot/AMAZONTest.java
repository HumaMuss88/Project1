package TESTNGBootcampProject.BootcampTestNG_HomeDepot;

import org.testng.annotations.Test;

import TESTNGBootcampProject.BootcampTestNG_HomeDepot.AMAZONPOM;
import TESTNGBootcampProject.BootcampTestNG_HomeDepot.baseclassAmazonSShot;

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

public class AMAZONTest extends baseclassAmazonSShot {
	

		 
		 
	
  @Test (priority=1)
  public void f1() throws InterruptedException, IOException {
  System.out.println("This is first test");
  AMAZONPOM ob=new AMAZONPOM (driver);
ob.search_fieldclick();
//ob.search_sendclick();
//	  
	 Thread.sleep(5000); 
	 

  }
  
//  @Test (priority=2)
//  public void f2() throws InterruptedException, IOException {
//  System.out.println("This is second test");
// AMAZONPOM ob=new AMAZONPOM (driver);
//  ob.submitclick();
//  Thread.sleep(5000);
//	 ob.dressclick();
//	 Thread.sleep(5000);
//	 ob.mediiumclick();
//	 Thread.sleep(5000);
//	 ob.addcartclick();
//	 Thread.sleep(5000);
//	 shots_withdate();
//
//	  Thread.sleep(5000);
//  
//  
//  }
  

	
	  
  }

  
