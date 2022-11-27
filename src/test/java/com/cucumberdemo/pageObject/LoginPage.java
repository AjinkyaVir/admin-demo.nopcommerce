package com.cucumberdemo.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberdemo.utility.Base;

public class LoginPage extends Base{

	//public  WebDriver ldriver;

	@FindBy(id = "Email")
	private WebElement enterEmailAddress;

	@FindBy(id = "Password")
	private WebElement enterPassword;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement clickOnLoginBtn;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement clickOnLogoutBtn;

	public LoginPage(WebDriver ldriver) {

		PageFactory.initElements(ldriver, this);

	}

	public String getPTitle() {
		return driver.getTitle();
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
