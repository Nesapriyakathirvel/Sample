package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.flipkart.com/");
		//WebElement btnlogin = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		//btnlogin.click();
		WebElement txtname = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		txtname.sendKeys("nesa");
		WebElement txtpassword = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		
		txtpassword.sendKeys("12345");
}
}