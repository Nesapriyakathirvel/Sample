package com.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupAndDown {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement c1 = driver.findElement(By.xpath("//div[text()='Courses']"));
		WebElement c2 = driver.findElement(By.xpath("//h3[@id='heading8811']"));
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",c2);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false)",c1);
		
		
		
		
		
		
		
		
		
		
	}

		
}
