package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/1030205/Downloads/chromedriver_win32latest/chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();

			driver.findElement(By.xpath("//*[@id='autocomplete']")).sendKeys("Ind");
			Thread.sleep(2000);
			List<WebElement> options = driver.findElements(By.xpath("//*[@class='ui-menu-item']"));
			for (WebElement list : options) {

				if (list.getText().equalsIgnoreCase("India")) {
					list.click();

				}

			}
		} catch (Exception ex) {

		}
	}

}
