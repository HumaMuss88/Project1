package SDETTestNGProject1.TestNGPR1;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;


public class HomePOM {
	
public static WebDriver driver;
	
	@FindBy (xpath = "//*[text()='Back to School']")
	WebElement backtoschool;
	
	@FindBy (xpath = "//*[text()='Off to College']")
	WebElement offcollege;
	
	@FindBy (xpath = "//*[contains(text(),'Connect with')]")
	WebElement fbText;
	
	
	public HomePOM(WebDriver driver) {
		HomePOM.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	
	public void backtoschoolClick() {
		backtoschool.click();
	}
	
	public void offcollegeClick() {
		offcollege.click();
	}
	public void getfbText()	{
		String Expected_text = "Connect with friends and the world around you on Facebook.";
		String Actual_text = fbText.getText();
		
	//	Assert.assertEquals(Actual_text, Expected_text);
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(Actual_text, Expected_text);
		System.out.println("this is after assert");
		sa.assertAll();

	}
		
	

			

}

