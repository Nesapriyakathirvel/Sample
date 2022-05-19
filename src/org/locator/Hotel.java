   package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(" http://adactinhotelapp.com/");
	WebElement txtusername = driver.findElement(By.id("username"));
	txtusername.sendKeys("nesa");
	WebElement txtpassword = driver.findElement(By.id("password"));
	txtpassword.sendKeys("12345");
	//driver.quit();
}
}
