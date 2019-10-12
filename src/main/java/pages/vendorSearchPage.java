package pages;

import projectBase.ProjectSpecificBase;

public class vendorSearchPage extends ProjectSpecificBase{
	
	public vendorSearchPage enterVendorName() {
		driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys("Blue Lagoon");
		return this;
	}
	public vendorSearchResultsPage clickSearch() {
		driver.findElementByXPath("//button[@id='buttonSearch']").click();
		return new vendorSearchResultsPage();
	}
}
