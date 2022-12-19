package com.auto.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.auto.template.Base;



public class LoginPage extends Base{

	private WebDriver driver;
	String titleHomePage =  "Swag Labs";
	By locatorUser = By.id("user-name");
	By locatorPass = By.id("password");
	By locatorLoginBtn = By.id("login-button");
	By locatorHeaderProds = By.className("header_secondary_container");
	
	
		public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void LoginPage() throws InterruptedException {
		Type("standard_user", locatorUser);
		Type("secret_sauce", locatorPass);
		click(locatorLoginBtn);
		Thread.sleep(2000);
		
	}
	
	public boolean isProductPageDisplayed() {
		return isDisplayed(locatorHeaderProds);
	}
	
}
