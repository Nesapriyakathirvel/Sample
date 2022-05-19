package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			 "C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/login");
	WebElement txtusername = driver.findElement(By.name("username"));
	txtusername.sendKeys("9597686295");
	//driver.quit();
}
}
