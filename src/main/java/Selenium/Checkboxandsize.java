package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxandsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/1030205/Downloads/chromedriver_win32latest/chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();

			
			System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
			driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
			driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected();
			
			

		} catch (Exception ex) {

		}
	}

}
