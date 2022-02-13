package com.cl.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cl.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory - OR(Object Repository)
	// @FindBy(name = "email")
	@FindBy(xpath = "//*[@id='username']")
	WebElement username;

	// @FindBy(name = "password")
	@FindBy(xpath = "//*[@id='password']")
	WebElement password;

	@FindBy(xpath = "//*[contains(@name,'login')][2]")
	WebElement Loginbtn;

	@FindBy(xpath = "//*[text()='venkatteja.adurty']")
	WebElement name;

	// Initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
		// PageFactory class .intit means initialize with driver This means pointing to
		// the current class objects.

	}

	// Actions: Features available at login page
	public String validatingthenloginpagetitle() {

		return driver.getTitle();

	}

	public String Login(String Username, String Password) {

		username.sendKeys(Username);
		password.sendKeys(Password);
		Loginbtn.click();
		String personname = name.getText();
		return personname;

	}

}
