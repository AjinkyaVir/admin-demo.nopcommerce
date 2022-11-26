package com.cucumberdemo.textrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "./features/LoginFeature.feature",
		glue= "com.cucumberdemo.stepDefinition",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-reports/reports2.html"}
		
		)
public class TestRunner {
	/* This class will be empty */
}
