package com.auto.unlockuser.test;

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

public class LoginTest {

	private WebDriver driver;
	LoginPageUnlock loginPageUnlock;

	@Given("^Go to the SWAGLABS main page$")
	public void to_the_SWAGLABS_main_page() {

		System.out.println("Start the Test");
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.saucedemo.com";
		driver.get(url);

//		loginPage = new LoginPage(driver);
//		loginPage.visit("https://www.saucedemo.com");
	}

	@When("^Add your username and password$")
	public void add_your_username() throws InterruptedException {

		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("locked_out_user");

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");

	}

	@And("^Click on login Page$")
	public void click_on_login_Page() {

		WebElement submit = driver.findElement(By.className("submit-button"));
		submit.click();
	}

	@Then("^verify message error$")
	public void verify_if_page_was_displayed() {
		
		//Section of Verifications
				WebElement errorMessage = driver.findElement(By.className("error-message-container"));
				String expectedErrorMessage = "Epic sadface: Sorry, this user has been locked out.";
				String actualMessage = errorMessage.getText();
				
				
				Assert.assertEquals(actualMessage.contains(expectedErrorMessage), 
						"Actual user is not valid");
				

	}

}
