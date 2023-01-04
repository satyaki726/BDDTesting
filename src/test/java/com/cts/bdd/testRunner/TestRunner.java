package com.cts.bdd.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features"},
		glue = {"com.cts.bdd.steps"},//json,html,junit
		plugin = {"pretty","html:Report1"},
		dryRun = false,
		tags = "@P5",
		monochrome = true
		)
public class TestRunner {

}
