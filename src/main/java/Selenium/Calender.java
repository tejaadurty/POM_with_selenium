package Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender {

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/1030205/Downloads/chromedriver_win32latest/chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("https://www.spicejet.com/");
			driver.manage().window().maximize();

			List<WebElement> datecount = driver.findElements(By.xpath(
					"//*[@class='css-1dbjc4n r-1awozwy r-14lw9ot r-1loqt21 r-eu3ka r-gld05i r-1otgn73 r-1aockid']"));
			//Thread.sleep(2000);

			//WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			for (int i = 0; i < datecount.size(); i++) {
				String dated = driver.findElements(By.xpath(
						"//*[@class='css-1dbjc4n r-1awozwy r-14lw9ot r-1loqt21 r-eu3ka r-gld05i r-1otgn73 r-1aockid']"))
						.get(i).getText();

				if (dated.equalsIgnoreCase("22")) {

					driver.findElements(By.xpath(
							"//*[@class='css-1dbjc4n r-1awozwy r-14lw9ot r-1loqt21 r-eu3ka r-gld05i r-1otgn73 r-1aockid']"))
							.get(i).click();
				}

			}
		} catch (

		Exception ex) {

		}
	}
}
