package AutomationExercise1.Testcases;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import AutomationExercise1.Pages.Login;
import AutomationExercise1.Pages.ProductsPage;

public class SearchProductTC {


	private static final WebDriver driver = null;
	Login vl = new Login(driver);
	ProductsPage pp = new ProductsPage(driver);
	@Test
	public void SearchproductVisibilty(String expectedproductName) {
		String actualProductname = ProductsPage.getSearchedProductName();
		Assert.assertEquals(expectedproductName, actualProductname);
		System.out.println("The actual product name that we got after searching is: " + actualProductname);
	}

	@Test
	public void VerifySearchFunctionality() {
		pp.clickOnSearchIcon();
	}

	@Test
	public void All_the_products_related_to_search_should_be_visible() {
		List<String> actualProductNames = ProductsPage.getAllSearchedProductNames();
		
		System.out.println("Below are the displayed products in products page\n======================================");
		
		for (String productName : actualProductNames) {
			System.out.println(productName);
		}
	}
}
