package com.wait;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver .get("https://www.facebook.com");
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		element.click();
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		
		WebElement Until = wait.until(new Function<WebDriver,WebElement>()	{
				@Override
		public WebElement apply(WebDriver t) {
					WebElement element2 = driver.findElement(By.xpath("//input[@name='firstname']"));
					return null;
				}
		});
		


	
		Until.sendKeys("nesa");		
			
				
		}		
}
