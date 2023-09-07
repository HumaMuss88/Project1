package TESTNGBootcampProject.BootcampTestNG_HomeDepot;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

@Test
public class NewTestExpediaBC {
	public static WebDriver driver;

  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.out.println("This is before test, we will open browser here");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\fiza_\\eclipse-workspace\\humamaven1\\Drivers\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://www.expedia.com/");
      driver.manage().window().maximize();
      
  Thread.sleep(5000);
  }
  
  public void f() throws InterruptedException {
	  System.out.println("This is before test 1");
	  ExpediaFlightPOM ob= new ExpediaFlightPOM(driver);
	  ob.flightClick();
      
      Thread.sleep(5000);
  }

  public void f2() throws InterruptedException {
	  System.out.println("This is test 2");
	  ExpediaFlightPOM ob= new ExpediaFlightPOM(driver);
	  ob.LeavingClick();
	  Thread.sleep(5000);
  }
  @Test 
  public void f3() throws InterruptedException {
	  System.out.println("This is test 3");
	  ExpediaFlightPOM ob= new ExpediaFlightPOM(driver);
	  ob.Leaving_FromSend();
	  
	  Thread.sleep(5000);
  }
  
  @Test 
  public void f4() throws InterruptedException {
	  System.out.println("This is test 4");
	  ExpediaFlightPOM ob= new ExpediaFlightPOM(driver);
	  ob.Going_ToClick();
	  
	  Thread.sleep(5000);
  }
  
  
  @Test 
  public void f5() throws InterruptedException {
	  System.out.println("This is test 5");
	  ExpediaFlightPOM ob= new ExpediaFlightPOM(driver);
	  ob.Going_ToSend();
	  
	  Thread.sleep(5000);
  }
  @Test 
  public void f6() throws InterruptedException {
	  System.out.println("This is test 6");
	  ExpediaFlightPOM ob= new ExpediaFlightPOM(driver);
	  ob.DateClick();
	  
	  Thread.sleep(5000);
  }
  
  @Test 
  public void f7() throws InterruptedException {
	  System.out.println("This is test 7");
	  ExpediaFlightPOM ob= new ExpediaFlightPOM(driver);
	  ob.SepClick();
	
	  
	  Thread.sleep(8000);
  }
  @Test 
  public void f8() throws InterruptedException {
	  System.out.println("This is test 8");
	  ExpediaFlightPOM ob= new ExpediaFlightPOM(driver);
	  ob.DoneClick();
	
	  
	  Thread.sleep(8000);
  }
  
  @Test 
  public void f9() throws InterruptedException {
	  System.out.println("This is test 9");
	  ExpediaFlightPOM ob= new ExpediaFlightPOM(driver);
	  ob.SearchClick();
	
	  
	  Thread.sleep(8000);
  }
  @Test 
  public void f10() throws InterruptedException {
	  System.out.println("This is test 10");
	  ExpediaFlightPOM ob= new ExpediaFlightPOM(driver);
	  ob.allerClick();
	
	  
	  Thread.sleep(8000);
  }
  @Test 
  public void f11() throws InterruptedException {
	  System.out.println("This is test 11");
	  ExpediaFlightPOM ob= new ExpediaFlightPOM(driver);
	  ob.allerselectClick();
	
	  
	  Thread.sleep(8000);
  }
  

@Test 
public void f12() throws InterruptedException {
	  System.out.println("This is test 12");
	  ExpediaFlightPOM ob= new ExpediaFlightPOM(driver);
	  ob.retourClick();
	
	  
	  Thread.sleep(8000);
}

@Test 
public void f13() throws InterruptedException {
	  System.out.println("This is test 13");
	  ExpediaFlightPOM ob= new ExpediaFlightPOM(driver);
	  ob.retourselectClick();
	
	  
	  Thread.sleep(8000);
}

@Test 
public void f14() throws InterruptedException {
	  System.out.println("This is test 14");
	  Set<String> winsession= driver.getWindowHandles();
	  Iterator<String> itr= winsession.iterator();
	  String win1 = itr.next();
	  String win2 = itr.next();
	  
	  driver.switchTo().window(win2);
	  
	  ExpediaFlightPOM ob= new ExpediaFlightPOM(driver);
	  ob.CheckoutClick();
	  
	  ob.TitleSelect();
	  
	  ob.FirstNameSend();
	
	  
	  Thread.sleep(8000);
}
  
  
  

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test, we will close browser here");
	  driver.quit();
  }

}
