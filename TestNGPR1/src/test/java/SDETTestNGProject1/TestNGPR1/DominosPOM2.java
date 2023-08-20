package SDETTestNGProject1.TestNGPR1;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;


public class DominosPOM2 {
	
public static WebDriver driver;
	
	@FindBy (xpath = "//*[@data-quid='main-navigation-order-online']")
	WebElement orderonline;
	

	
	@FindBy (xpath = "//*[@id='tab-Delivery']")
	WebElement delivery;
	
	@FindBy (xpath = "//*[@id='Type']")
	WebElement AdressType;
	
	@FindBy (xpath = "//*[@id='Street']")
	WebElement Street;
	
	
	
	
	public DominosPOM2(WebDriver driver) {
		DominosPOM2.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	
	public void orderonlineClick() {
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
	      
		
}

}		



