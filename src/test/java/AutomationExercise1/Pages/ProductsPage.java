package AutomationExercise1.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductsPage {

	WebDriver driver;
	//constructor
	public ProductsPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Test Cases')]") WebElement productsopt;
	
	@FindBy(xpath="//a[contains(text(),'Cart')]") WebElement cartopt;
	
	@FindBy(xpath="(//button[contains(text(), 'View Product')])[1]") WebElement viewprod1btn;
	
	@FindBy(xpath="//h2[contains(text(),'Blue Top')]") WebElement prodname;
	
	@FindBy(xpath="//p[contains(text(),'Category: Women > Tops')]") WebElement category;
	
	@FindBy(xpath="//span[contains(text(),'Rs. 500')]") WebElement price;
	
	@FindBy(xpath="//b[contains(text(),'Availability:')]") WebElement avail;
	
	@FindBy(xpath="//b[contains(text(),'Condition:')]") WebElement cond;
	
	@FindBy(xpath="//b[contains(text(),'Brand:')]") WebElement brand;
	
	@FindBy(xpath="//input[@id='search_product']") WebElement searchbar;
	
	@FindBy(xpath="//button[@id='submit_search']") WebElement searchbtn ;
	
	@FindBy(linkText="Add to cart") WebElement Add1;
	
	@FindBy(partialLinkText="Add to ca") WebElement Add2;
	
	@FindBy(xpath="//button[contains(text(),'Continue Shopping')])") WebElement popclick;
	
	@FindBy(xpath="//u[contains(text(),'View Cart')]") WebElement viewcartbtn;
	

	@FindBy(xpath = "//a[@href='/products']")
	WebElement productsOption;
	
	@FindBy(xpath = "//div[@class=\"features_items\"]/child::div[contains(@class,'col-sm')]")
	List<WebElement> productsList;
	
	@FindBy(xpath = "//div[@class='productinfo text-center']//p[contains(text(),'Cotton Mull Embroidered Dress')]")
	static
	
	WebElement searchedProductName;
	
	@FindBy(xpath = "//div[@class='productinfo text-center']//p[contains(text(),'T-Shirt')]")
	static
	
	List<WebElement> searchedProductNames;
	
	public void productpage() {
		productsopt.click();
		String actual = driver.getCurrentUrl();
		String expected = "https://automationexercise.com/products";
		Assert.assertEquals(actual, expected);
	}
	public void clickcartopt() {
		cartopt.click();
	}
	
	public void addtocart() {
		Add1.click();
		popclick.click();
		Add2.click();
		popclick.click();
		
	}
	
	public void viewcart() {
		viewcartbtn.click();
		String actual = driver.getCurrentUrl();
		String expected = "https://automationexercise.com/view_cart";
		Assert.assertEquals(actual, expected);
		
	}
	public boolean ProductsVisible() {
        return productsList.size() > 0;
    }
	
	public int getProductCount() {
		return productsList.size();
	}
	
	public void clickOnviewprodbtn() {
		viewprod1btn.click();
	}
	
	public void ProductDetailsPageVisible() {
		 prodname.isDisplayed();
		 category.isDisplayed();
		 price.isDisplayed();
		 avail.isDisplayed();
		 cond.isDisplayed();
		 brand.isDisplayed();
	}
	
	public void clickOnSearchIcon() {
		searchbtn.click();
	}
	
	public void clickonviewcart() {
		viewcartbtn.click();
	}

	public static String getSearchedProductName() {
		return searchedProductName.getText();
	}
	
	public static List<String> getAllSearchedProductNames() {
        List<String> productNames = new ArrayList<>();
        for (WebElement productNameElement : searchedProductNames) {
            productNames.add(productNameElement.getText().trim());
        }
        return productNames;
    }
}

