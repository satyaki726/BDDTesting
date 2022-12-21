package com.cts.bdd.steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayAdvancedSearch_Steps {
	
	WebDriver driver;
	
	public EbayAdvancedSearch_Steps(Common_Steps common_Steps) {
		this.driver = common_Steps.getDriver();
	}
	
	@Given("I am on Ebay Advanced Search Page")
	public void i_am_on_ebay_advanced_search_page() {
	   driver.get("https://www.ebay.com/sch/ebayadvsearch");
	}
	@When("I click on Ebay Logo")
	public void i_click_on_ebay_logo() {
	    driver.findElement(By.xpath("//a[@id='gh-la']")).click();
	}
	@Then("I am navigated to Ebay Home Page")
	public void i_am_navigated_to_ebay_home_page() {
	    String expUrl = "https://www.ebay.com/";
	    String actUrl = driver.getCurrentUrl();
	    if(!expUrl.equals(actUrl))
	    	fail("The Page is not coming as expected");
	}

}
