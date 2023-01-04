package com.cts.bdd.steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
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
	
	@When("I advanced search an item")
	public void i_advanced_search_an_item(DataTable dataTable) throws Exception {
	   driver.findElement(By.xpath("//input[@id='_nkw']")).sendKeys(dataTable.cell(1, 0));
	   driver.findElement(By.xpath("//input[@id='_ex_kw']")).sendKeys(dataTable.cell(1, 1));
	   driver.findElement(By.xpath("//input[@name='_udlo']")).sendKeys(dataTable.cell(1, 2));
	   driver.findElement(By.xpath("//input[@name='_udhi']")).sendKeys(dataTable.cell(1, 3));
	   driver.findElement(By.xpath("//button[@id='searchBtnLowerLnk']")).click();
	   Thread.sleep(3000);
	}




}
