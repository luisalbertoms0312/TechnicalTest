package com.auto.test;

import java.util.List;

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
	LoginPage loginPage;

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

	@When("^Add your username$")
	public void add_your_username() throws InterruptedException {

		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");

	}

	@And("^Click on login Page$")
	public void click_on_login_Page() {

		WebElement submit = driver.findElement(By.className("submit-button"));
		submit.click();
	}

	@Then("^verify if page was displayed$")
	public void verify_if_page_was_displayed() {
		List<WebElement> names = driver.findElements(By.xpath("//*[@class='inventory_item_name']"));
		for (int i = 0; i < names.size(); i++) {
			String elements = names.get(i).getText();
			System.out.println(elements);

			if (elements.contains("Sauce Labs Backpack")) {

				driver.findElements(By.cssSelector("#add-to-cart-sauce-labs-backpack")).get(i).click();

			}
		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement cartShp = driver.findElement(By.className("shopping_cart_link"));
		cartShp.click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement remove = driver.findElement(By.id("remove-sauce-labs-backpack"));
		remove.click();

		WebElement backMainPage = driver.findElement(By.id("continue-shopping"));
		backMainPage.click();

	}

}
