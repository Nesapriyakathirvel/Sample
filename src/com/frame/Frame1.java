package com.frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/guru99home/");
	List<WebElement> elements = driver.findElements(By.tagName("iframe"));//------------count
	int size = elements.size();
	System.out.println(size);
	driver.switchTo().frame("a077aa5e");
	WebElement img1 = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	img1.click();  
	
	
	
	
	
	
	
	
	
	
	
}
}
