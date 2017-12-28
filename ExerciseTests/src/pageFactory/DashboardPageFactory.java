package pageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityLibrary.ElementVerificationsAndActions;

public class DashboardPageFactory {
	WebDriver driver;
	ElementVerificationsAndActions elementverifications;
	boolean res;
	
	@FindBy(id="page_title")
	WebElement page_header;
	
	@FindBy(xpath="//a[text()='Customers']")
	WebElement customers_tab;
	
	@FindBy(xpath="//a[text()='Products']")
	WebElement products_tab;
	
	public DashboardPageFactory(WebDriver driver) {
		this.driver = driver;
		elementverifications = new ElementVerificationsAndActions(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean verifyDashboardAndClickCustomersTab() {
		res = elementverifications.verifyElementVisible(page_header);
		res = elementverifications.clickElement(customers_tab);
		return res;
		}
	public boolean verifyDashboardAndClickProductsTab() {
		res = elementverifications.verifyElementVisible(page_header);
		res = elementverifications.clickElement(products_tab);
		return res;
		}

}
