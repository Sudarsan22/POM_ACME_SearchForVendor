package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import projectBase.ProjectSpecificBase;

public class Dashboard extends ProjectSpecificBase {
	
	public Dashboard hoverVendor() {
		WebElement vendor = driver.findElementByXPath("(//button[@class='btn btn-default btn-lg'])[4]");
		Actions action = new Actions(driver);
		action.moveToElement(vendor).perform();
		return this;
	}
	public vendorSearchPage clickSearchVendor() {
		WebElement SearchForVendor = driver.findElementByXPath("//*[text()='Search for Vendor']");
		Actions action1 = new Actions(driver);
		action1.click(SearchForVendor).perform();
		return new vendorSearchPage();
	}
}
