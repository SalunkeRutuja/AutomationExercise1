package AutomationExercise1.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.support.FindBy;

public class RegisterUserPage {

	WebDriver driver;
	//constructor
	public RegisterUserPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[contains(text(), 'Signup / Login')]") WebElement signupopt;
	
	@FindBy(xpath="//h2[contains(text(),'New User Signup!')]") WebElement newusertext ;
	
	@FindBy(name="name") WebElement uname ;
	
	@FindBy(name="email") WebElement emailadd ;
	
	@FindBy(xpath="//button[contains(text(),'Signup')]") WebElement signupbtn;
	
	@FindBy(xpath="//b[contains(text(),'Enter Account Information')]") WebElement detailstext;
	
	@FindBy(xpath="//input[@id='id_gender2']") WebElement checkbox;
	
	@FindBy(xpath="//input[@id='password']") WebElement password;
	
	@FindBy(xpath="//select[@id='days']") WebElement day;
	
	@FindBy(xpath="//select[@id='months']") WebElement month;
	
	@FindBy(xpath="//select[@id='years']") WebElement year;
	
	@FindBy(xpath="//input[@id='newsletter']") WebElement chkbox1;
	
	@FindBy(xpath="//input[@id='optin']") WebElement chkbox2;
	
	@FindBy(xpath="//input[@id='first_name']") WebElement firstn;
	
	@FindBy(xpath="//input[@id='last_name']") WebElement lastn;
	
	@FindBy(xpath="//input[@id='company']") WebElement company;
	
	@FindBy(xpath="//input[@id='address1']") WebElement add;
	
	@FindBy(xpath="//input[@id='address2']") WebElement add1;
	
	@FindBy(xpath="//input[@id='state']") WebElement state;
	
	@FindBy(xpath="//input[@id='city']") WebElement city;
	
	@FindBy(xpath="//input[@id='zipcode']") WebElement pincode;
	
	@FindBy(xpath="//input[@id='mobile_number']") WebElement mobn;
	
	@FindBy(xpath="//button[contains(text(),'Create Account')]") WebElement createactbtn;
	
	@FindBy(xpath="/*[contains(text(), 'ACCOUNT CREATED!')]") WebElement actcreatedtext;
	
	@FindBy(xpath="//button[text()='Continue']") WebElement continuebtn;
	
	@FindBy(xpath= "//a[contains(text(),'Logged in as')]") WebElement loggedinusertext;
	
	@FindBy(xpath= "//a[contains(text(),'Delete Account')]") WebElement deleteact;
	
	@FindBy(xpath= "//b[contains(text(),'Account Deleted!')]") WebElement ActDeletedtext;
	
	@FindBy(xpath= "//a[contains(text(),'Continue')]") WebElement continue1;
	
	@FindBy(xpath= "//p[contains(text(),'Email Address already exist!')]") WebElement error;
	
	@FindBy(xpath= "//a[contains(text(),'Test Cases')]") WebElement TestCasesopt;
	
	@FindBy(xpath= "//b[contains(text(),'Test Cases')]") WebElement testcasetitle;
	
	public void page() {
		String actual = driver.getTitle();
		
		String expected = "AutomationExercise";
		
		Assert.assertEquals(actual, expected);
	}
	
	public void newusertext() {
		signupopt.click();
		newusertext.isDisplayed();
	}
	
	public void signup() {
		uname.sendKeys("Newuser");
		emailadd.sendKeys("new@123");
		signupbtn.click();
	}
	
	public void reregisteremail() {
		uname.sendKeys("Rutuja");
		emailadd.sendKeys("new@123");
		signupbtn.click();
		error.isDisplayed();
	}
	
	public void checkoutsignup() {
		uname.sendKeys("Checkoutuser");
		emailadd.sendKeys("checkoutuser@gmail.com");
		signupbtn.click();
		
	}
	public void detaispage() {
		detailstext.isDisplayed();
	}
	
	public void Fillformdetails(){
		checkbox.click();
		password.sendKeys("hello123");
		Select sel = new Select(day);
		sel.deselectByVisibleText("4");
		Select sel1 = new Select(month);
		sel1.deselectByVisibleText("June");
		Select sel2 = new Select(year);
		sel2.deselectByVisibleText("2010");
		chkbox1.click();
		chkbox2.click();
		firstn.sendKeys("Rutuja");
		lastn.sendKeys("Salunke");
		company.sendKeys("Automation");
		state.sendKeys("Maharashtra");
		city.sendKeys("Pune");
		pincode.sendKeys("413102");
		mobn.sendKeys("1234567890");
		createactbtn.click();
	}
	
	public void actcreation() {
		actcreatedtext.isDisplayed();
		continuebtn.click();
	}
	
	public void loggedinuser() {
		loggedinusertext.isDisplayed();
		deleteact.click();
	}
	
	public void delacc() {
		deleteact.click();
	}
	
	public void actdeleted() {
		ActDeletedtext.isDisplayed();
		continue1.click();
	}
	
	public void TestCase() {
		TestCasesopt.click();
		String acttitle= driver.getTitle();
		String exptitle= "Automation Practice Website for UI Testing - Test Cases";
		Assert.assertEquals(acttitle, exptitle);
		testcasetitle.isDisplayed();
	}
	
}
