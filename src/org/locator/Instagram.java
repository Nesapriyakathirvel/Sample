package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {//------------------------>debug
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(2500);//---------------------->breakpoint
		WebElement txtusername = driver.findElement(By.xpath("//input[@name='username']"));
		txtusername.sendKeys("Nesapriya@gmail.com");
		WebElement txtpassword = driver.findElement(By.name("password"));
		txtpassword.sendKeys("Kioo@234");
	}
}








