package com.cucumberdemo.textrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "./features/LoginFeature.feature",
		glue= "com.cucumberdemo.stepDefinition",
		dryRun = false, //dryRun = true to check all the scenarios from .feature file is implemented or not
		monochrome = true,
		plugin = {"pretty","json:target/cucumber-json-report/reports-json.json",
				"html:target/cucumber-reports/reports-html.html",
				"junit:target/cucumber-xml-report/reports-xml.xml"
				}
		
		
		//plugin = {"pretty","html:target/cucumber-reports/reports2.html"}
		
		)
public class TestRunner {
	/* This class will be empty */
}
