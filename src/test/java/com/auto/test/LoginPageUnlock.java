package com.auto.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.auto.template.Base;



public class LoginPageUnlock extends Base{

	private WebDriver driver;
	
	By locatorUser = By.id("user-name");
	By locatorPass = By.id("password");
	By locatorLoginBtn = By.id("login-button");
	By locatorMessageError = By.className("error-message-container");
	
	
	
		public LoginPageUnlock(WebDriver driver) {
		super(driver);
	}
	
	public void LoginPage() throws InterruptedException {
		Type("locked_out_user", locatorUser);
		Type("secret_sauce", locatorPass);
		click(locatorLoginBtn);
		Thread.sleep(2000);
		
	}
	
		
}
