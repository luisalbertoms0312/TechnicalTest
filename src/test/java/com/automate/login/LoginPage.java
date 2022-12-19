package com.automate.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.auto.template.Template;



public class LoginPage extends Template{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	By locatorUser = By.id("user-name");
	By locatorPass = By.id("password");
	By locatorLoginBtn = By.id("login-button");
	By locatorHeaderProds = By.className("header_secondary_container");
	
	
	public void loginUser(String password, String username) throws InterruptedException {
//		Type("standard_user", locatorUser);
//		Type("secret_sauce", locatorPass);
		Type(password, locatorUser);
		Type(username, locatorPass);
		click(locatorLoginBtn);
		Thread.sleep(2000);
	}
	
	
	
}
