package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver .get("https://www.facebook.com");
	String title = driver.getTitle();
	System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	//verify
	  WebElement txtusername = driver.findElement(By.id("email"));
	  txtusername.sendKeys("nesapriya");
	  WebElement txtpassword = driver.findElement(By.id("pass"));
	  txtpassword.sendKeys("nesa@123");
	  driver.quit();
	  
	  
} 
}
