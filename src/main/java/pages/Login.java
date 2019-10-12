package pages;

import org.openqa.selenium.By;

import projectBase.ProjectSpecificBase;

public class Login extends ProjectSpecificBase {
	public Login enterEmail() {
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		return this;
		}
	public Login enterPwd() {
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		return this;
	}
	public Dashboard clickLogin() {
		driver.findElement(By.id("buttonLogin")).click();
		return new Dashboard();
	}

}
