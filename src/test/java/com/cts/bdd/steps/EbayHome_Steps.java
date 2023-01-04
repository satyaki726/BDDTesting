package com.cts.bdd.steps;

import static org.junit.Assert.fail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	
	@When("I search for {string}")
	public void i_search_for_iphone(String prod) {
	   driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(prod);
	   driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	}
	@Then("I validate atleast {int} search items present")
	public void i_validate_atleast_search_items_present(int count) {
	   String text = driver.findElement(By.cssSelector("h1.srp-controls__count-heading>span.BOLD:first-child")).getText().trim();
	   String textReplaced = text.replace(",", ""); 
	   int itemCount = Integer.parseInt(textReplaced);
	   if(itemCount<=count) {
		   fail("Item is less than 1000");
	   }
	}

	@When("I search for {string} in {string} category")
	public void i_search_for_in_category(String string, String string2) {
		  driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(string);
		  List<WebElement> findElements = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		  for (WebElement webElement : findElements) {
			if(webElement.getText().trim().toLowerCase().equals(string2.toLowerCase())) {
				webElement.click();
				break;
			}
		}
		   driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	}



	
}
