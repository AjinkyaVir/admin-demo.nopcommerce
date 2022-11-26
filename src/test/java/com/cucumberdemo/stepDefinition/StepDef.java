package com.cucumberdemo.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumberdemo.pageObject.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;

public class StepDef {

	public WebDriver driver;
	public LoginPage loginPage;
	
	@Given("Launch browser")
	public void launch_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    loginPage = new LoginPage(driver);
	}

	@When("Enter valid url {string}")
	public void enter_valid_url(String url) {
	   driver.get(url);
	}

	@When("Enter email as {string} and Password as {string}")
	public void enter_email_as_and_password_as(String email, String pass) {
	   loginPage.enterEmailAddress(email);
	   loginPage.enterPassword(pass);
	}

	@When("click on Login")
	public void click_on_login() {
	   loginPage.clickOnLoginBtn();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedPageTitle) {
	  String actualTitle = driver.getTitle();
	  System.out.println(actualTitle);
	  if(actualTitle.equals(expectedPageTitle)) {
		  Assert.assertTrue(true);
	  }else {
		  Assert.assertTrue(false);
	  }
	  
	}

	@When("User click on Logout page")
	public void user_click_on_logout_page() {
	    loginPage.clickOnLogoutBtn();
	}

	@Then("close browser")
	public void close_browser() {
	   driver.close();
	}
	
}
