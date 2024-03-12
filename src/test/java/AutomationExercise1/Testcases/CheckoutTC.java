package AutomationExercise1.Testcases;

import org.testng.annotations.Test;

import AutomationExercise1.Pages.BaseTest;
import AutomationExercise1.Pages.CartPage;
import AutomationExercise1.Pages.CheckoutPage;
import AutomationExercise1.Pages.PaymentPage;
import AutomationExercise1.Pages.ProductsPage;
import AutomationExercise1.Pages.RegisterUserPage;

public class CheckoutTC extends BaseTest{

	ProductsPage pp = new ProductsPage(driver);
	CartPage cp = new CartPage(driver);
	RegisterUserPage rp = new RegisterUserPage(driver);
	CheckoutPage chp = new CheckoutPage(driver);
	PaymentPage payp = new PaymentPage(driver);
	
	@Test
	public void checkout() {
		pp.addtocart();
		pp.viewcart();
		cp.proceedtocheckout();
		rp.checkoutsignup();
		rp.Fillformdetails();
		rp.actcreation();
		pp.clickcartopt();
		cp.clickonproceed();
		chp.comment();
		chp.placeorder();
		payp.carddetails();
		payp.placeorder();
		payp.ordersuccessfullmsg();
		rp.delacc();
		rp.actdeleted();
	}
}
