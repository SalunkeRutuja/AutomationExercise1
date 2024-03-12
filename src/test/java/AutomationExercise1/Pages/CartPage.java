package AutomationExercise1.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, null);
	//constructor
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);

	}
	
	@FindBy(xpath="//tbody/tr[@id='product-5']/td[6]/a[1]/i[1]") WebElement removebtn;
	
	@FindBy(xpath="//a[contains(text(),'Proceed To Checkout')]") WebElement proceedtochoutbtn ;
	
	@FindBy(xpath="//input[@id='susbscribe_email']") WebElement emailtosubs;
	
	@FindBy(xpath="//input[@id='susbscribe_email']") WebElement subsarrbtn;
			
	@FindBy(xpath="\"//div[@id='notification']\"") By subscriptiontext;
	
	@FindBy(xpath="\"//u[contains(text(),'Register / Login')]\"") WebElement logchout;
	
	
	
	public void subscribedetails() {
		emailtosubs.sendKeys("new@123");
		subsarrbtn.click();
	}
	
	public void clickonproceed() {
		proceedtochoutbtn.click();
	}
	public void cartsubscribetext() {
		
	    WebElement subscriptionTextElement = wait.until(ExpectedConditions.visibilityOfElementLocated(subscriptiontext));
	    String subscriptionText = subscriptionTextElement.getText();
	    System.out.println("Subscription Text: " + subscriptionText);
	}
	
	public void proceedtocheckout() {
		proceedtochoutbtn.click();
		logchout.click();
	}
	}

