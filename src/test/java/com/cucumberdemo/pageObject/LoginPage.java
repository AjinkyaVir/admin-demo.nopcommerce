package com.cucumberdemo.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public static WebDriver driver;

	@FindBy(id = "Email")
	private WebElement enterEmailAddress;

	@FindBy(id = "Password")
	private WebElement enterPassword;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement clickOnLoginBtn;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement clickOnLogoutBtn;

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void enterEmailAddress(String email) {
		enterEmailAddress.clear();
		enterEmailAddress.sendKeys(email);

	}

	public void enterPassword(String password) {
		enterPassword.clear();
		enterPassword.sendKeys(password);

	}

	public void clickOnLoginBtn() {

		clickOnLoginBtn.click();
	}

	public void clickOnLogoutBtn() {

		clickOnLogoutBtn.click();
	}
	
	

}
