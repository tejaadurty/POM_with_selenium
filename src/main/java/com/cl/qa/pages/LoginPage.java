package com.cl.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cl.qa.base.TestBase;
import com.cl.qa.util.AbstractCommands;

public class LoginPage extends TestBase {

	// Page Factory - OR(Object Repository)
	// @FindBy(name = "email")
	@FindBy(xpath = "//a[text()='Login']")
	WebElement loginbutton;
	@FindBy(xpath = "//a[text()='Demo']")
	WebElement Demobutton;
	@FindBy(xpath = "//a[text()='Pricing']")
	WebElement Pricingbutton;
	@FindBy(xpath="//div[@class='dropdown-content featuresDropdown']/preceding::span[text()='Features']")
	WebElement features;
	
	@FindBy(xpath="//a[text()='Flights Module']")
	WebElement flightmodule;
	

	// Initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
		// PageFactory class .intit means initialize with driver This means pointing to
		// the current class objects.

	}
	
	
	
	public String pagetitle()
	{
	String title=driver.getTitle();
	System.out.println(title);
	return title;
	
	}
	public void homepage_clicks()
	{
		loginbutton.click();
		AbstractCommands.switchtomainwindow();
		//driver.navigate().back();
		AbstractCommands.waiting(2);
		Demobutton.click();
		AbstractCommands.waiting(1);
		
		Pricingbutton.click();
		AbstractCommands.waiting(10);
		
		features.click();
		Actions action= new Actions(driver);
		action.moveToElement(flightmodule).click().perform();
			
		
	}



	

}
