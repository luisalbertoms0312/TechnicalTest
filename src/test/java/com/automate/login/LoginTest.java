package com.automate.login;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	WebDriver driver;
	LoginPage loginPage;
	
	
	@Before
	public void setUp(){
		
	}
	
	@Given("^Go to the main page$")
	public void to_the_main_page() throws InterruptedException {
		loginPage = new LoginPage(driver);
		driver = loginPage.lauchDriver();
		loginPage.visit("https://www.saucedemo.com");
		
	}

	
	@When("^Add your (.*) and (.*)$")
	public void add_your_username_and_password(String username, String password) throws InterruptedException {
		loginPage.loginUser(username, password);
	}
//
//	
//	}
//
//	@And("^And Click on login Page$")
//	public void click_on_login_Page() {
//	
//	}
//
//	@Then("^Then verify if page was displayed$")
//	public void verify_if_page_was_displayed() {
//
//		
//	}
}
