package com.cts.bdd.steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHome_Steps {
	
	WebDriver driver;
	
	public EbayHome_Steps(Common_Steps common_Steps) {
		this.driver = common_Steps.getDriver();
	}
	
	@Given("I am on Ebay Home Page")
	public void i_am_on_ebay_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.ebay.com/");
	}

	@When("I click on Advanced Link")
	public void i_click_on_advanced_link() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Advanced")).click();
	}

	@Then("I navigate to Advaned Search Page")
	public void i_navigate_to_advaned_search_page() {
	    // Write code here that turns the phrase above into concrete actions
	    String expUrl = "https://www.ebay.com/sch/ebayadvsearch";
	    String actUrl = driver.getCurrentUrl();
	    if(!expUrl.equals(actUrl)) {
	    	fail("Page doesn't navigate");
	    }
	}
}
