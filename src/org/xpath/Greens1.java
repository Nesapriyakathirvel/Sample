package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	WebElement btnresume = driver.findElement(By.xpath("//div[@id='heading201']"));
	btnresume.click();
	WebElement btn1 = driver.findElement(By.xpath("//a[text()='Resume Model-1 ']"));
	btn1.click();
	driver.quit();
}
}
