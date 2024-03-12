package AutomationExercise1.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	WebDriver driver;
	//constructor
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//body/section[@id='cart_items']/div[1]/div[6]/textarea[1]") WebElement descriptionbox;
	
	@FindBy(xpath="//a[contains(text(),'Place Order')]") WebElement placeorderbtn;
	
	public void comment() {
		descriptionbox.sendKeys("Project on Automation Exercise");
	}
	
	public void placeorder() {
		placeorderbtn.click();
	}
}
