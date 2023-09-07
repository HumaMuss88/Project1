package TESTNGBootcampProject.BootcampTestNG_HomeDepot;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ExpediaFlightPOM {
	

	public static WebDriver driver;
	
	@FindBy (xpath= ("(//*[@class='uitk-tab-text'])[2]"))
	WebElement flight ;
	
	@FindBy (xpath= ("//*[@aria-label='Leaving from']"))
	WebElement Leaving ;
	
	@FindBy (xpath= "//*[@id='origin_select']")
	WebElement Leaving_From ;
	
	@FindBy (xpath= "//*[@aria-label='Going to']")
	WebElement Going_To ;
	
	@FindBy (xpath= "//*[@id='destination_select']")
	WebElement Going_To2 ;
	
	@FindBy (xpath= "//*[@id='date_form_field-btn']")
	WebElement Date ;
	
	@FindBy (xpath= "//*[@aria-label='Sep 11, 2023']")
	WebElement Sep ;
	
	@FindBy (xpath= "//*[@aria-label='Save changes and close the date picker.']")
	WebElement Done ;
	
	@FindBy (xpath= "//*[@id='search_button']")
	WebElement Search ;
	
	@FindBy (xpath= "//*[@stid='FLIGHTS_DETAILS_AND_FARES-index-1-leg-0-fsr-FlightsActionButton']")
	WebElement aller ;
	
	@FindBy (xpath= "//*[@data-stid='select-button']")
	WebElement allerselect ;
	
	@FindBy (xpath= "//*[@stid='FLIGHTS_DETAILS_AND_FARES-index-1-leg-1-fsr-FlightsActionButton']")
	WebElement retour ;
	
	@FindBy (xpath= "//*[@data-test-id='select-button']")
	WebElement retourselect ;
	
	@FindBy (xpath= ("(//*[@data-stid='goto-checkout-button'])[1]"))
	WebElement Checkout ;
	
	@FindBy (xpath= ("//*[@id='title[0]']"))
	WebElement Title ;
	
	@FindBy (xpath= "//*[@id='firstname[0]']")
	WebElement FirstName ;
	



	
	public ExpediaFlightPOM(WebDriver driver) {

		ExpediaFlightPOM.driver=driver;

		PageFactory.initElements(driver, this);

		}
	public void flightClick() {
		flight.click();
	}
	public void LeavingClick() {
		Leaving.click();
	}
	
	public void Leaving_FromSend() {
		Leaving_From.sendKeys("Miami");
		Leaving_From.sendKeys(Keys.ENTER);
}
	public void Going_ToClick() {
		Going_To.click();
	}
	public void Going_ToSend() {
		Going_To2.sendKeys("Paris");
		Going_To2.sendKeys(Keys.ENTER);
}
	public void DateClick() {
		Date.click();
	}
	public void SepClick() {
		Sep.click();
	}
	public void DoneClick() {
		Done.click();
	}
	
	public void SearchClick() {
		Search.click();
	}
	
	public void allerClick() {
		aller.click();
	}
	
	public void allerselectClick() {
		allerselect.click();
	}
	
	public void retourClick() {
		retour.click();
	}
	
	public void retourselectClick() {
		retourselect.click();
	}
	
	public void CheckoutClick() {
		Checkout.click();
	}
	
	public void TitleSelect() {
		 Select ob = new Select(Title);
	        ob.selectByVisibleText("Ms.");
	}
	public void FirstNameSend() {
		FirstName.sendKeys("Chelsea");
	}

	
	
		
	}
	
	
	



