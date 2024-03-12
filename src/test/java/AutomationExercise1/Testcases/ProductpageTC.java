package AutomationExercise1.Testcases;

import org.testng.annotations.Test;

import AutomationExercise1.Pages.BaseTest;
import AutomationExercise1.Pages.ProductsPage;

public class ProductpageTC extends BaseTest{

	ProductsPage pp= new ProductsPage(driver);
	
	@Test
	public void VerifyProductPageIsVisible() {
		pp.productpage();
	}
	
	@Test
	public void VerifyProductList() {
		pp.ProductsVisible();
		
}
	@Test
	public void VerifyProductCount() {
		pp.getProductCount();
	}
	
	@Test
	public void VerifyViewProductBtnFunctionality() {
		pp.clickOnviewprodbtn();
	}
	
	public void VerifyProductDetailsareDisplayed() {
		pp.ProductDetailsPageVisible();
	}
}