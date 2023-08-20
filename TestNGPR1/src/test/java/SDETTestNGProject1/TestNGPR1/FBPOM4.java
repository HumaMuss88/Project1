package SDETTestNGProject1.TestNGPR1;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;


public class FBPOM4 {
	
public static WebDriver driver;


@FindBy (xpath = "//*[@id='email']")
WebElement fb_EmailField;

@FindBy (xpath = "//*[@id='pass']")
WebElement fb_PassField;

public FBPOM4(WebDriver driver) {
	FBPOM4.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	
public void enterEmail(String email) {
	fb_EmailField.sendKeys(email);
}

public void enterPass(String pass) {
	fb_PassField.sendKeys(pass);
}

	
	
	
	
	
	
	/*public void orderonlineClick() {
		orderonline.click();
	}
	
	
	
	public void deliveryClick() {
		delivery.click();
	}
	public void AdressTypeSelect() {
		 Select ob = new Select(AdressType);
	        ob.selectByVisibleText("Hotel");

	}
	
	public void StreetSend() {
		 Street.sendKeys("123 G");
	      
		
}*/

}		



