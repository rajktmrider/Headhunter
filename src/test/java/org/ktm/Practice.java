package org.ktm;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raj KTMrider_96\\eclipse-workspace\\WorhsheetAuto\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();

	}

	@BeforeMethod
	public void beforeMethod() {
		Date date = new Date();
		System.out.println(date);
	}

	@AfterMethod
	public void afterMethod() {
		Date dates = new Date();
		System.out.println(dates);
	}

	@Test
	public void tc1() {
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("neelakandan");
		WebElement elementp = driver.findElement(By.id("password"));
		elementp.sendKeys("neelakandan");
		driver.findElement(By.id("login")).click();
	}
}

