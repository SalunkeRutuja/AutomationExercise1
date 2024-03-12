package AutomationExercise1.Pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import AutomationExercise1.Utility.BrowserFactory;

public class BaseTest {
	public WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		driver=BrowserFactory.startApplication(driver, "Chrome","https://automationexercise.com/");
	}
	
	@AfterClass
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);
	}
 
}
