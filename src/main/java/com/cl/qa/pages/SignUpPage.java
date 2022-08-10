package com.cl.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

import com.cl.qa.base.TestBase;
import com.cl.qa.util.AbstractCommands;

public class SignUpPage extends TestBase  {
	@FindBy(xpath = "//a[text()='Sign up']")
	WebElement signupbutton;
	
	@FindBy(xpath="//input[@id='inputFirstName']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='inputLastName']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='inputEmail']")
	WebElement emailaddress;
	
	@FindBy(xpath="//div[@class='iti-arrow']")
	WebElement countrydropdown;
	
	@FindBy(xpath="//span[text()='India (भारत)']")
	WebElement India;
	
	@FindBy(xpath="//input[@id='inputPhone']")
	WebElement mobile;
	//Billing Details
	
	@FindBy(xpath="//input[@id='inputCompanyName']")
	WebElement companyname;
	
	@FindBy(xpath="//input[@id='inputAddress1']")
	WebElement Address;
	
	@FindBy(xpath="//input[@id='inputAddress2']")
	WebElement Address2;
	
	@FindBy(xpath="//input[@id='inputCity']")
	WebElement cityname;
	
	@FindBy(xpath="//input[@id='stateinput']")
	WebElement state;
	
	@FindBy(xpath="//input[@id='inputPostcode']")
	WebElement postalcode;
	
	
	@FindBy(xpath="//select[@id='inputCountry']")
	WebElement countryselection;
 
	//Account Security webelements
	
	@FindBy(xpath="//input[@id='inputNewPassword1']")
	WebElement pswrd1;
	
	@FindBy(xpath="//input[@id='inputNewPassword2']")
	WebElement confirmpassword;
	
	@FindBy(xpath="//button[@type='button' and @class='btn btn-default btn-sm btn-sm-block generate-password']")
	WebElement generatepswrd;
	
	@FindBy(xpath="//button[@type='submit' and @class='btn btn-default btn-sm']")
	WebElement new_generatedpswrd;
	
	@FindBy(xpath="//button[@id='btnGeneratePasswordInsert']")
	WebElement copy_clipboard;
	
	@FindBy(xpath= "//span[@class='bootstrap-switch-handle-on bootstrap-switch-success']")
	WebElement  Yes_maillist;
	
	@FindBy(xpath="//input[@value='Register']")
	WebElement Register;
	
	
	
	
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
		// PageFactory class .intit means initialize with driver This means pointing to
		// the current class objects.

	}
	
	public void click_signup() {
		signupbutton.click();
		
	}
	public void Enterprofessionalinfo()
	{
		AbstractCommands.switchtowindow();
		AbstractCommands.waiting(1);
		firstname.sendKeys("sireesha");
		lastname.sendKeys("mantena");
		emailaddress.sendKeys("ttt@gmail.com");
		countrydropdown.click();
		AbstractCommands.waiting(1);
		AbstractCommands.scrollIntoViewJS("//span[text()='India (भारत)']");
		India.click();
		AbstractCommands.waiting(2);
		mobile.sendKeys("7093196703");
		
		
		
	}
	public void Billing_details()
	{
		AbstractCommands.waiting(1);
		companyname.sendKeys("BlueYonder");
		Address.sendKeys("Hyderabad,IT park");
		AbstractCommands.waiting(1);
		Address2.sendKeys("salpuriasatva");
		cityname.sendKeys("Hyderabad");
		state.sendKeys("Telangana");
		postalcode.sendKeys("502032");
		AbstractCommands.waiting(3);
		Select sel= new Select(countryselection);
		sel.selectByVisibleText("India");
		AbstractCommands.waiting(1);
	}
	
	public void Account_security()
	{
		pswrd1.sendKeys("Test");
		confirmpassword.sendKeys("testtttt");
		
		generatepswrd.click();
		
		AbstractCommands.switchtowindow();
		AbstractCommands.waiting(3);
		new_generatedpswrd.click();
		copy_clipboard.click();
		AbstractCommands.waiting(1);
		
	}
	
	public void join_mail_list()
	{
		Yes_maillist.click();
		
	}
	
	public void Register_done()
	{
		AbstractCommands.waiting(8);
		Register.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
