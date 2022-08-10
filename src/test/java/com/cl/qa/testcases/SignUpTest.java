package com.cl.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cl.qa.base.TestBase;
import com.cl.qa.pages.SignUpPage;

public class SignUpTest  extends TestBase{
	
	SignUpPage signup;
	
	public SignUpTest() {
		super();
	}
	
	@BeforeTest
	public void setUp() {

		initialization();
		signup = new SignUpPage();
	}
	
	@Test(priority=0)
	
	public void clickonsignup()
	{
		signup.click_signup();
	}

	@Test(priority=1)
	public void Enter_personalinfo()
	{
		signup.Enterprofessionalinfo();
	}
	
	@Test(priority=2)
	public void BillingAddress() {
		
		signup.Billing_details();
	}
	
	@Test(priority=3)
	public void Account_security_test()
	{
		signup.Account_security();
	}
	
	@Test(priority=4)
	public void join_mailinglist_test()
	{
		signup.join_mail_list();
	}
	@Test(priority=5)
	public void register_test()
	{
		signup.Register_done();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	

	
	
	

}
