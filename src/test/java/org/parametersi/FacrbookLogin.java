package org.parametersi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacrbookLogin {
@Test(dataProvider="96")
public void tc1(String email,String pass) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raj KTMrider_96\\eclipse-workspace\\WorhsheetAuto\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement id = driver.findElement(By.id("email"));
	id.sendKeys(email);
	WebElement passi = driver.findElement(By.id("pass"));
	passi.sendKeys(pass);
	
}
@DataProvider(name="96")
public Object[] [] data(){
	return new Object[] [] {
		{"raj","ktmrider96"},
		{"hari","humterman"},
		{"sri","gunslinger"},
		{"arun","runningman"},
   };
  }
}
