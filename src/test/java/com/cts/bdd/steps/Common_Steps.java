package com.cts.bdd.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Common_Steps {

	WebDriver driver;

	// In Before hook Higher Priority -> The hook that executed before rest of any
	// other before hook
	// In After hook Higher Priority -> The hook that executed after rest of any
	// other after hook

	@Before(order = 0)
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Global Before Hook Got Exectued");
	}

	@After(order = 1)
	public void closeDown() throws Exception {
		driver.quit();
		System.out.println("Global After Hook Got Exectued");
		Thread.sleep(1000);
	}

	public WebDriver getDriver() {
		return driver;
	}
}
