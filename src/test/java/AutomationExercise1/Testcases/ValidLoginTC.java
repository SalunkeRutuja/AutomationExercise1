package AutomationExercise1.Testcases;

import org.testng.annotations.Test;

import AutomationExercise1.Pages.BaseTest;
import AutomationExercise1.Pages.Login;

public class ValidLoginTC extends BaseTest{

	Login vl = new Login(driver);
	
	@Test
	public void VerifyPageUrl() {
		vl.HomePage();
	}
	
	public void VerifyLogin() {
		vl.login();
	}
	
	public void VerifySuccessfullLogin() {
		vl.userloggedin();
	}
	
	public void VerifyDeletedAccount() {
		vl.DeleteAccount();
	}
}
