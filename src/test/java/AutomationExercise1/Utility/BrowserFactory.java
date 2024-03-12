package AutomationExercise1.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {


	public static WebDriver startApplication(WebDriver driver,String browserName,String appUrl)
	{
		
		if(browserName.equals("Chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rutuja Salunke\\eclipse-workspace\\Sauce\\Drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Users\\Rutuja Salunke\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("IE"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/IEDriverServer.exe");
	         driver = new InternetExplorerDriver();
		}
		else
		{
			System.out.println("We do not support this browser ");
		}
 
		
		//driver.manage().window().maximize();
		driver.get(appUrl);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
		return driver;

	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}
}
