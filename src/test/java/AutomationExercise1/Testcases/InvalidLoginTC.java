package AutomationExercise1.Testcases;

import org.testng.annotations.Test;

import AutomationExercise1.Pages.BaseTest;
import AutomationExercise1.Pages.Login;

	public class InvalidLoginTC extends BaseTest{

		Login vl = new Login(driver);
		
		@Test
		public void VerifyPageUrl() {
			vl.HomePage();
		}
	
		
		@Test
		public void InvalidLoginErrorText()
		{
			vl.invalidlogin();
		}
		
		
}

