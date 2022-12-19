package com.auto.test;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestAll {

	private WebDriver driver;
	LoginPageUnlock loginPageUnlock;

	@Given("^browser is open$")
	public void browser_is_open() {
		System.out.println("Start the Test");
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
	}

	@And("^user in on login page$")
	public void user_in_on_login_page() {
		String url = "https://www.saucedemo.com";
		driver.get(url);
	}
	
	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@And("^clicks on login button$")
	public void clicks_on_login_button() {

		WebElement submit = driver.findElement(By.className("submit-button"));
		submit.click();
	}

	@Then("^user is navigated to the home page$")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("step4");
	
		
//		//Section of Verifications
//				WebElement errorMessage = driver.findElement(By.className("error-message-container"));
//				String expectedErrorMessage = "Epic sadface: Sorry, this user has been locked out.";
//				String actualMessage = errorMessage.getText();
//				
//				
//				Assert.assertEquals(actualMessage.contains(expectedErrorMessage), 
//						"Actual user is not valid");
				

	}

}
