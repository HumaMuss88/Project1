package TESTNGBootcampProject.BootcampTestNG_HomeDepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HDepotsignupPOM {
	public static WebDriver driver;
	
	@FindBy (xpath= "//*[@class='MyAccount__label SimpleFlyout__link--bold'][1]")
	WebElement myacc_field ;
	
	@FindBy (xpath= ("(//*[@class='bttn__content'])[3]"))
	WebElement create_field ;
	
	@FindBy (xpath= "//*[@class='bttn__content'][1]")
	WebElement personal_field ;
	
	@FindBy (xpath= ("//*[@type='email']"))
	WebElement email_field ;
	
	@FindBy (xpath= ("//*[@id='password-input-field']"))
	WebElement pw_field ;
	
	@FindBy (xpath= ("//*[@id='zipCode']"))
	WebElement zip_field ;
	
	@FindBy (xpath= ("//*[@id='phone']"))
	WebElement phone_field ;
	
	public HDepotsignupPOM(WebDriver driver) {

		HDepotsignupPOM.driver=driver;

		PageFactory.initElements(driver, this);

		}
	public void myacc_fieldClick() {
		myacc_field.click();
	}
	public void create_fieldClick() {
		 create_field.click();
		 
	}
	public void personal_fieldClick() {
		personal_field.click();
		 
	}
	public void email_fieldSend() {
		email_field.sendKeys("abc@gmail.com");
		 
	}
	public void pw_fieldSend() {
		pw_field.sendKeys("abciun");
		 
	}
	
	public void zip_fieldSend() {
		zip_field.sendKeys("29302");
		 
	}
	
	public void  phone_fieldSend() {
		 phone_field.sendKeys("52478930");
		 
	}
	
	
	}



