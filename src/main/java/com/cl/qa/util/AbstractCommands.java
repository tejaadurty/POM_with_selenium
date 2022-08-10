package com.cl.qa.util;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.cl.qa.base.TestBase;

public class AbstractCommands extends TestBase{

	
	public static void  scrollIntoViewJS(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
		waiting(1);
		}

	public  static void waiting(int time) {
		try {
			Thread.sleep(time *1000);
		}catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void switchtowindow()
	{
		Set<String> winhandles=driver.getWindowHandles();
	
		for(String windows:winhandles)
		{
			driver.switchTo().window(windows);
			System.out.println(windows);
		}
		
	}
	public static void switchtomainwindow()
	{
	 String mainwindow=driver.getWindowHandle();
	
		driver.switchTo().window(mainwindow);
		
	}
	

	
}
