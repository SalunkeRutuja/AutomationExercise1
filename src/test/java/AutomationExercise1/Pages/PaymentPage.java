package AutomationExercise1.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage {

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, null);

	//constructor
	public PaymentPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="name_on_card") WebElement nameoncard;
	
	@FindBy(name="card_number") WebElement cardno;
	
	@FindBy(name="cvc") WebElement cvc;
	
	@FindBy(name="expiry_month") WebElement expmonth;
	
	@FindBy(className="control-label") WebElement expyear ;
	
	@FindBy(xpath="//button[@id='submit']") WebElement submitbtn;
	
	@FindBy(xpath="\"//div[@class='alert alert-success']\"") WebElement successmsg ;
	
		
	public void carddetails() {
		nameoncard.sendKeys("RutujaSalunke");
		cardno.sendKeys("411111111111");
		cvc.sendKeys("234");
		expmonth.sendKeys("10");
		expyear.sendKeys("2045");
		
	}
	public void placeorder() {
		submitbtn.click();
	}
	
	public void ordersuccessfullmsg() {
		
	        WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated((By) successmsg));
	        String successMessage = successMessageElement.getText();
	        if (successMessage.contains("Your order has been placed successfully!")) {
	            System.out.println("Success message is verified: " + successMessage);
	        } else {
	            System.out.println("Success message verification failed.");
	        }

	}
}
