package AutomationExercise1.Testcases;

import org.testng.annotations.Test;

import AutomationExercise1.Pages.BaseTest;
import AutomationExercise1.Pages.Login;
import AutomationExercise1.Pages.RegisterUserPage;

public class ExistingemailregistrationTC extends BaseTest {

	RegisterUserPage rp = new RegisterUserPage(driver);
	Login vl = new Login(driver);
	
	@Test
	public void VerifyHomePage() {
		rp.page();
	} 
	
	@Test
	public void VerifyLoginPage() {
		vl.loginpage();
	}
	
	@Test
	public void VerifyEmailAlreadyExistError() {
		rp.reregisteremail();
	}
}
