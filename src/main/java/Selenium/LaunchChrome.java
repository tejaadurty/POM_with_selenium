package Selenium;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/1030205/Downloads/chromedriver_win32latest/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://www.orangehrm.com/"); String title= driver.getTitle();
		 * driver.manage().window().maximize();
		 * System.out.print("Current Page title: "+title); //Select s= new Select
		 * (driver.findElement(By.xpath("//a[text()='FREE TRIAL']")));
		 */
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("Venkat");

		driver.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys("Teja");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@type='radio' and @value='Male']")).click();
		driver.findElement(By.xpath("//*[@id='checkbox1' and @value='Cricket']")).click();
		
		//Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//*[@id='msdd']")).click();
		
		Select skills = new Select(driver.findElement(By.xpath("//*[@id='Skills']")));
		Thread.sleep(2000);
		skills.selectByVisibleText("Adobe InDesign");
		skills.selectByIndex(5);
		//driver.findElement(By.xpath("//*[@id='country']")).click();
		Select country = new Select(driver.findElement(By.xpath("//*[@id='country']")));
		country.selectByVisibleText("Denmark");
		Select year = new Select(driver.findElement(By.xpath("//*[@id='yearbox']")));
		year.selectByVisibleText("1990");
		Select month = new Select(driver.findElement(By.xpath("//*[@placeholder='Month']")));
		month.selectByVisibleText("March");
		Select day = new Select(driver.findElement(By.xpath("//*[@id='daybox']")));
		day.selectByVisibleText("11");
		driver.findElement(By.xpath("//*[@id='submitbtn']")).click();

	}

}
