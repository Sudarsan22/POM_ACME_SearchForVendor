package pages;

import projectBase.ProjectSpecificBase;

public class vendorSearchResultsPage extends ProjectSpecificBase{
	
public vendorSearchResultsPage getCountryName() {
	String text = driver.findElementByXPath("//td[contains(text(), 'France')]").getText();
	System.out.println(text);
	return this;
	}
public vendorSearchResultsPage clickLogOut() {
	driver.findElementByXPath("//*[text()='Log Out']").click();
	return this;
}
}
