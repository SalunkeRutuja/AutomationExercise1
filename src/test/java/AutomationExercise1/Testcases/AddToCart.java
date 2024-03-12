package AutomationExercise1.Testcases;

import org.testng.annotations.Test;

import AutomationExercise1.Pages.BaseTest;
import AutomationExercise1.Pages.ProductsPage;

public class AddToCart extends BaseTest{

	ProductsPage pp = new ProductsPage(driver);
	
	@Test
	public void VerifyUserIsAbleToAddProducts() {
		pp.addtocart();
	}
	
	@Test
	public void VerifyViewCartFunctionality() {
		pp.clickonviewcart();
	}
	
	@Test
	public void VerifyCartPaseNavigation() {
		pp.viewcart();
	}
}
