package pageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityLibrary.ElementVerificationsAndActions;
public class NewProductPageFactory {
	WebDriver driver;
	ElementVerificationsAndActions elementverifications;
	boolean res;
	
	@FindBy(id="product_title")
	WebElement booktitle;
	
	@FindBy(id="product_description")
	WebElement bookdescription;
	
	@FindBy(id="product_price")
	WebElement bookprice;
	
	@FindBy(id="product_image_file_name")
	WebElement bookpic;
	
	@FindBy(name="commit")
	WebElement createproductbutton;
	public NewProductPageFactory(WebDriver driver) {
		this.driver = driver;
		elementverifications = new ElementVerificationsAndActions(driver);
		PageFactory.initElements(driver, this);
	}
	public void template() {
	System.out.println("methods to enter required fields and click create product button will be similar like Create New Customer. Hence leaving this at this point.");
	}
	
}
