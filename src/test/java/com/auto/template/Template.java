package com.auto.template;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Template {

	private WebDriver driver;

	public Template(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver lauchDriver() {
		System.out.println("Lauch Browser");
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public void click(By locator) {
		driver.findElement(locator).click();
	}

	public void Type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);

	}

	public void visit(String url) {
		driver.get(url);
	}

	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public List<WebElement> findElements(By locator) {
		return driver.findElements(locator);
	}

	public String getText(WebElement element) {
		return element.getText();
	}

	public String getText(By locator) {
		return driver.findElement(locator).getText();
}
}