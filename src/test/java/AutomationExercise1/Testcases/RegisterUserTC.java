package AutomationExercise1.Testcases;

import org.testng.annotations.Test;

import AutomationExercise1.Pages.BaseTest;
import AutomationExercise1.Pages.RegisterUserPage;

public class RegisterUserTC extends BaseTest {

	RegisterUserPage rp = new RegisterUserPage(driver);
	
	@Test
	public void VerifyHomePage() {
		rp.page();
	}
	
	public void VerifyNewUserSignUp() {
		rp.signup();
	}
	
	public void VerifyEnterAccountInformationpagevisibility() {
		rp.detaispage();
	}
	
	public void VerifyUserIsAbleToFillForm() {
		rp.Fillformdetails();
	}
	
	public void VerifyAccountCreation() {
		rp.actcreation();
	}
	
	public void VerifyUserLogin() {
		rp.loggedinuser();
	}
	
	public void VerifyIfAccountIsDeleted() {
		rp.actdeleted();
	}
}
