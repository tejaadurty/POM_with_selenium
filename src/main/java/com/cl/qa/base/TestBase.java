package com.cl.qa.base;

import java.io.FileInputStream;
import java.net.URI;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {

			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:/Users/1030205/OneDrive - Blue Yonder/Documents/Sireesha/Sample/src/main/java/com/cl"
							+ "/qa/config/config.properties");
			prop.load(ip);

		} catch (Exception ex) {

			ex.printStackTrace();
		}

	}
	
	//initialization method 
	
	public static void initialization() {
		
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			
			
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/1030205/Downloads/chromedriver_win32latest/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}

}
