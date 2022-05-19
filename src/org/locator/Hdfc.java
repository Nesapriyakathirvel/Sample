package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
public static void main(String[] args) {//-----------------------using frame
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/");
	driver.switchTo().frame("login_page");
	WebElement txtuserid = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
	txtuserid.sendKeys("12456");
}
}
