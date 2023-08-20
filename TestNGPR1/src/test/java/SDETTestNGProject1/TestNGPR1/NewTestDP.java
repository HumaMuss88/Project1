package SDETTestNGProject1.TestNGPR1;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTestDP extends baseclass{
  @Test(dataProvider = "dp")
  public void f(String email, String pass) throws InterruptedException {
	  FBPOM4 ob= new FBPOM4 (driver);
	  ob.enterEmail(email);
	  Thread.sleep(5000);
	  ob.enterPass(pass);
	  Thread.sleep(5000);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abc@yahoo.com", "bhhhhhh" },
      new Object[] { "dif@yahoo.com", "vhhhhhh" },
    };
  }
}
