package testcases;

import org.testng.annotations.Test;

import pages.Login;
import projectBase.ProjectSpecificBase;

public class TC001LoginLogout extends ProjectSpecificBase{
	@Test
	public void loginTestcase() {
		new Login()
		.enterEmail()
		.enterPwd()
		.clickLogin()
		.hoverVendor()
		.clickSearchVendor()
		.enterVendorName()
		.clickSearch()
		.getCountryName()
		.clickLogOut();
	}

}
