package com.automate.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartTest {

	WebDriver driver;
	LoginPage loginPage;
	
	
	@Before
	public void setUp(){
		
	}
	
	@Given("^Go the main page$")
	public void to_the_main_page() throws InterruptedException {
		loginPage = new LoginPage(driver);
		driver = loginPage.lauchDriver();
		loginPage.visit("https://www.saucedemo.com");
		
	}

	
	@When("^Add the (.*) and (.*)$")
	public void add_your_username_and_password(String username, String password) throws InterruptedException {
		loginPage.loginUser(username, password);
	}
//
//	
//	}
//
	@And("^get elements and select specific item$")
	public void get_elements_and_select_specific_item() {
		List<WebElement> names = driver.findElements(By.xpath("//*[@class='inventory_item_name']"));
		for (int i = 0; i < names.size(); i++) {
			String elements = names.get(i).getText();
			System.out.println(elements);

			if (elements.contains("Sauce Labs Backpack")) {

				driver.findElements(By.cssSelector("#add-to-cart-sauce-labs-backpack")).get(i).click();

			}
		}
	}
//	
//	}
//
	@And("^go to cart list$")
	public void go_to_cart_list() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement cartShp = driver.findElement(By.className("shopping_cart_link"));
		cartShp.click();
	

}
	
	
	@Then("^wait and remove$")
	public void wait_and_remove() {
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
