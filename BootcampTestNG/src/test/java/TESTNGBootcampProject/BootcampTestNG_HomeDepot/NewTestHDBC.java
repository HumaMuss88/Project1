package TESTNGBootcampProject.BootcampTestNG_HomeDepot;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTestHDBC {
	public static WebDriver driver;

  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.out.println("This is before test, we will open browser here");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\fiza_\\eclipse-workspace\\humamaven1\\Drivers\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://www.homedepot.com/");
      driver.manage().window().maximize();
      
  Thread.sleep(5000);
  }
  
  @Test  
  public void f() throws InterruptedException {
	  System.out.println("This is before test 1");
	  HDepotsignupPOM ob= new HDepotsignupPOM(driver);
	  ob.myacc_fieldClick();
      
      Thread.sleep(5000);
  }

  @Test 
  public void f2() throws InterruptedException {
	  System.out.println("This is test 2");
	  HDepotsignupPOM ob= new HDepotsignupPOM(driver);
	  ob.create_fieldClick();
      Thread.sleep(5000);
  }
  @Test 
  public void f3() throws InterruptedException {
	  System.out.println("This is test 3");
	  HDepotsignupPOM ob= new HDepotsignupPOM(driver);
	  ob.personal_fieldClick();
       
      Thread.sleep(5000);
  }
  
  @Test 
  public void f4() throws InterruptedException {
	  System.out.println("This is test 4");
	  HDepotsignupPOM ob= new HDepotsignupPOM(driver);
	  ob.email_fieldSend();
      
	  ob.pw_fieldSend();
	  
	  ob.zip_fieldSend();
	  
	  ob.phone_fieldSend();
      
      
      
      
       
      Thread.sleep(5000);
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test, we will close browser here");
	  driver.close();
  }

}
