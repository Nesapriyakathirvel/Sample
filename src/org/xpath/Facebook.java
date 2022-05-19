package org.xpath;

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
		  WebElement txtusername = driver.findElement(By.xpath("//input[@id='email']"));
		  txtusername.sendKeys("nesapriya");
		  WebElement txtpassword = driver.findElement(By.xpath("//input[@id='pass']"));
		  txtpassword.sendKeys("nesa@123");
		  WebElement btnlogin = driver.findElement(By.xpath("//button[@name='login']"));
		  btnlogin.click();
		  driver.quit();
}
}
