package Selenium;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {

	@BeforeTest
	public void Btest() {
		System.out.println("Before test");
	}

	@Test
	public void test() {
		System.out.println("test");
	}
}
