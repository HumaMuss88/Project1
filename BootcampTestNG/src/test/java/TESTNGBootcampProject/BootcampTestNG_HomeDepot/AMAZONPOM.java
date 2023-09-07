   package TESTNGBootcampProject.BootcampTestNG_HomeDepot;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;


public class AMAZONPOM {
	
public static WebDriver driver;


@FindBy (xpath = "//*[@name='field-keywords']")
WebElement search_field;

//@FindBy (xpath = "//*[@name='field-keywords']")
//WebElement search_send;
//
//@FindBy (xpath = "//*[@type='submit']")
//WebElement submit;
//
//@FindBy (xpath = "//*[@class='a-size-base-plus a-color-base a-text-normal'][1]")
//WebElement dress;
//
//@FindBy (xpath = "//*[@name='2'][2]")
//WebElement medium;
//
//@FindBy (xpath = "//*[@title='Add to Shopping Cart']")
//WebElement addcart;

public AMAZONPOM(WebDriver driver) {
	AMAZONPOM.driver=driver;
	PageFactory.initElements(driver, this);
	}
public void search_fieldclick() {
	search_field.click();
}
	
//public void search_sendclick() {
//	search_send.sendKeys("summer dress");
//}
//
//public void submitclick() {
//	submit.click();
//}
//public void dressclick() {
//	dress.click();
//}
//public void mediiumclick() {
//	medium.click();
//}
//public void addcartclick() {
//	addcart.click();
//}	
//	
	
	
	

}		



