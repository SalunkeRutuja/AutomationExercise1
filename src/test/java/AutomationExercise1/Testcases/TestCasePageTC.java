package AutomationExercise1.Testcases;

import org.testng.annotations.Test;

import AutomationExercise1.Pages.BaseTest;
import AutomationExercise1.Pages.RegisterUserPage;

public class TestCasePageTC extends BaseTest {

RegisterUserPage rp = new RegisterUserPage(driver);
	
	@Test
	public void VerifyHomePage() {
		rp.page();
	}
	
	@Test
	public void VerifySuccessfullTestCasePageNavigation() {
		rp.TestCase();
	}
}
