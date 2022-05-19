package com.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWindows {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.amazon.in");
	WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	element.sendKeys("iphone",Keys.ENTER);
	WebElement element2 = driver.findElement(By.xpath("//span[text()='Apple iPhone 11 (64GB) - Green']"));
	element2.click();
	String parentid = driver.getWindowHandle();
	System.out.println(parentid);
	Set<String> allwindows = driver.getWindowHandles();
	System.out.println(allwindows);
	for (String eachWindowsId : allwindows) {
		if(!parentid .equals(eachWindowsId));
		driver.switchTo().window(eachWindowsId);
	}
	
	WebElement element3 = driver.findElement(By.xpath("//input[@name='submit.add-to-cart']"));
	
	element3.click();
	
	
	}
	
}
