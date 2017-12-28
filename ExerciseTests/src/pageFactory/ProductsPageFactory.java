package pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityLibrary.ElementVerificationsAndActions;

public class ProductsPageFactory {
	WebDriver driver;
	ElementVerificationsAndActions elementverifications;
	boolean res;
	
	@FindBy(xpath="//a[text()='New Product']")
	WebElement newproductbutton;
	
	@FindBy(id="product_title")
	WebElement booktitle;
	
	@FindBy(id="product_description")
	WebElement bookdescription;
	
	@FindBy(id="product_price")
	WebElement bookprice;
	
	@FindBy(id="product_image_file_name")
	WebElement bookpic;
	
	@FindBy(xpath = "//li[@class='scope featured_products']/a")
	WebElement featuredproducts;
	
	@FindBy(name="commit")
	WebElement createproductbutton;
	public ProductsPageFactory(WebDriver driver) {
		this.driver = driver;
		elementverifications = new ElementVerificationsAndActions(driver);
		PageFactory.initElements(driver, this);
	}
	
	public boolean locateFeaturedProductsTab() {
		res = elementverifications.verifyElementVisible(featuredproducts);
		return res;
	}
	public void clickfeaturedTab() {
		elementverifications.clickElement(featuredproducts);
	}
	public boolean findYourBook(String book) {
		List<WebElement> allfeatured = driver.findElements(By.cssSelector("img[alt]"));
		System.out.println("Size of list:"+allfeatured.size());
		for(WebElement entry:allfeatured) {
			if(book.equalsIgnoreCase(entry.getAttribute("alt"))) {
				entry.click();
				res = true;
				break;
			}
			else {
				res = false;
			}
					
		}
		return res;
	}
	
}
