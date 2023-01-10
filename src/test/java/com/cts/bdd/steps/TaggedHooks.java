package com.cts.bdd.steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TaggedHooks {

	private WebDriver driver;

	public TaggedHooks(Common_Steps common_Steps) {
		this.driver = common_Steps.getDriver();
	}

	@Before(value = "@setCookies", order = 1)
	public void setCookie() {
		System.out.println("Tagged Before Hook Got Exectued");
	}

	@After(value = "@Test", order = 0)
	public void tests() {
		System.out.println("Tagged After Hook Got Executed");
	}
}
