package com.cl.qa.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cl.qa.base.TestBase;
import com.cl.qa.pages.LoginPage;
import org.testng.Assert;


public class LoginTest extends TestBase {

	LoginPage loginpage;
	

	public LoginTest() {

		super();// super class calls all the properties in the base class to use them here.

	}

	@BeforeMethod
	public void setUp() {

		initialization();
		loginpage = new LoginPage();
	}

	@Test(enabled=false)
	public void pagetitle() {
    String title= loginpage.pagetitle();
	
	Assert.assertEquals(title, "PHPTRAVELS booking script and system for hotels airline flights tours cars online application - PHPTRAVELS");

	}
	
	@Test(priority =1)
	public void homepage_test()
	{
		loginpage.homepage_clicks();
	}

	
}
