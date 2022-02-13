package com.cl.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cl.qa.base.TestBase;
import com.cl.qa.pages.HomePage;
import com.cl.qa.pages.LoginPage;

import org.testng.Assert;

/*import net.jodah.failsafe.internal.util.Assert;*/

public class LoginTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;

	public LoginTest() {

		super();// super class calls all the properties in the base class to use them here.

	}

	@BeforeMethod
	public void setUp() {

		initialization();
		loginpage = new LoginPage();
	}

	@Test(priority = 2)
	public void loginpagetitle() {

	String Title=loginpage.validatingthenloginpagetitle();
	
	Assert.assertEquals(Title, "My Account – Automation Practice Site");

	}
	
	@Test(priority = 1)
	public void CheckUserNamePassword(){
		
	String name=loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));

		Assert.assertEquals(name,"venkatteja.adurty");
	}

	@AfterMethod
	public void teardown() {

		driver.quit();

	}

}
