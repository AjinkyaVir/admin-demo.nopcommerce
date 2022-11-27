package com.cucumberdemo.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumberdemo.pageObject.AddNewCustomerPage;
import com.cucumberdemo.pageObject.LoginPage;
import com.cucumberdemo.utility.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;


public class StepDef extends Base{

	
	public LoginPage loginPage;
	public AddNewCustomerPage addNewCustomerPage;



	@Given("Launch browser")
	public void launch_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		addNewCustomerPage = new AddNewCustomerPage(driver);
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

	/***********************************
	 * Login Functionality
	 ************************************************/

	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedPageTitle) {
		String actualTitle = loginPage.getPTitle();
		System.out.println(actualTitle);
		if (actualTitle.equals(expectedPageTitle)) {
			Assert.assertTrue(true);
		} else {
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

	/******************************
	 * Add customer functionality
	 ************************************/

	@Then("User can view dashboard")
	public void user_can_view_dashboard() {

		String actualTitle = addNewCustomerPage.getPageTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Dashboard / nopCommerce administration";
		if (actualTitle.equals(expectedTitle)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@When("User click on Customers menu")
	public void user_click_on_customers_menu() {
		addNewCustomerPage.clickOnCustomerMenu();
		System.out.println("Customer menu clicked");
	}

	@When("click on Customers menu item")
	public void click_on_customers_menu_item() {
		addNewCustomerPage.clickOnCustomerMenuItem();
		System.out.println("Customer menu item clicked");
	}

	@When("Click on Add new button")
	public void click_on_add_new_button() {
		addNewCustomerPage.clickOnAddBtn();
	}

	@Then("User can see Add a new customer page")
	public void user_can_see_add_a_new_customer_page() {
		String actualTitle = addNewCustomerPage.getPageTitle();
		String expectedTitle = "Add a new customer / nopCommerce administration";

		if(actualTitle.equals(expectedTitle))
		{
			//log.info("User can view Add new customer page- passed");

			Assert.assertTrue(true);//pass
		}
		else
		{
			//log.info("User can view Add new customer page- failed");

			Assert.assertTrue(false);//fail
		}
	}

	@When("user enter customer info")
	public void user_enter_customer_info() {
		addNewCustomerPage.enterEmail("abc023562@gmail.com");
		addNewCustomerPage.enterPassword("test1");
		addNewCustomerPage.enterFirstName("Prachi");
		addNewCustomerPage.enterLastName("Gupta");
		addNewCustomerPage.enterGender("Female");
		addNewCustomerPage.enterDob("6/13/1988");
		addNewCustomerPage.enterCompanyName("CodeStudio");
		addNewCustomerPage.enterAdminContent("Admin content");
		addNewCustomerPage.enterManagerOfVendor("Vendor 1");
	}

	@When("click on Save button")
	public void click_on_save_button() {
		addNewCustomerPage.clickOnSave();
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String exptectedConfirmationMsg) {
		String bodyTagText = driver.findElement(By.tagName("Body")).getText();
		if(bodyTagText.contains(exptectedConfirmationMsg))
		{
			Assert.assertTrue(true);//pass
			//log.info("User can view confirmation message - passed");

		}
		else
		{
			//log.warn("User can view confirmation message - failed");

			Assert.assertTrue(false);//fail

		}
	}

}
