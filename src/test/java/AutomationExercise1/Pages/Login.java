package AutomationExercise1.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login {
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//constructor
	public Login(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[contains(text(), 'Signup / Login')]") WebElement signupopt;
	
	@FindBy(xpath="//h2[contains(text(),'Login to your account')]") WebElement loginacttext;
	
	@FindBy(name="email") WebElement emailaddress ;
	
	@FindBy(name= "password") WebElement pass;
	
	@FindBy(xpath= "//button[contains(text(),'Login')]") WebElement loginbtn;
	
	@FindBy(xpath= "//a[contains(text(),'Logged in as')]") WebElement loggedinusertext;
	
	@FindBy(xpath= "//a[contains(text(),'Delete Account')]") WebElement deleteact;
	
	@FindBy(xpath= "//b[contains(text(),'Account Deleted!')]") WebElement ActDeletedtext;
	
	@FindBy(xpath= "//p[contains(text(),'Your email or password is incorrect!')]") WebElement errortext;
	
	@FindBy(xpath= "//a[contains(text(),'Logout')]") WebElement logout;
	
	@FindBy(xpath= "//button[@id='scrollUpBtn']") WebElement scrollUpButton;

	@FindBy(xpath="//button[@id='scrollDownBtn']")WebElement scrollDownButton;

		
public void HomePage() {
	String actual = driver.getCurrentUrl();
	String expected = "https://automationexercise.com/";
	Assert.assertEquals(actual, expected);
}

public void login() {
	signupopt.click();
	loginacttext.isDisplayed();
	emailaddress.sendKeys("hellouser1@gmail.com");
	pass.sendKeys("password");
	loginbtn.click();
}

public void userloggedin() {
	loggedinusertext.isDisplayed();
	deleteact.click();
}

public void invalidlogin() {
	emailaddress.sendKeys("hellouser1@gmail.com");
	pass.sendKeys("123");
	loginbtn.click();
	errortext.isDisplayed();
}

public void DeleteAccount() {
	ActDeletedtext.isDisplayed();
	
	}

public void Logout() {
	logout.click();
	
}

public void loginpage() {
	String actual = driver.getCurrentUrl();
	String expected = "https://automationexercise.com/login";
	Assert.assertEquals(actual, expected);
}


public void scrollupwitharrow() {
js.executeScript("arguments[0].scrollIntoView(true);", scrollDownButton);
scrollUpButton.click();
try {
    Thread.sleep(2000);
} catch (InterruptedException e) {
    e.printStackTrace();
}

scrollDownButton.click();
try {
    Thread.sleep(2000);
} catch (InterruptedException e) {
    e.printStackTrace();
}

}
public void scrollupwithoutarrow() {
	js.executeScript("window.scrollBy(0, 500)");
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    // Scroll up
    js.executeScript("window.scrollBy(0, -500)");

    // Wait to see effect
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
	
}