package AutomationExercise1.Testcases;

import AutomationExercise1.Pages.BaseTest;
import AutomationExercise1.Pages.CartPage;

public class SubscribeTC extends BaseTest{

	CartPage cp = new CartPage(driver);
	
	public void VerifySubscriptionInCartPage() {
		cp.subscribedetails();
		cp.cartsubscribetext();
	}
}
