package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icic {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			 "C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	WebElement btnarro= driver.findElement(By.xpath("//img[@width='65']"));
	btnarro.click();
	WebElement txtuserid = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
	txtuserid.sendKeys("nesa@123");
	WebElement txtpassword = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
	txtpassword.sendKeys("123345@");
	
	
}
}
