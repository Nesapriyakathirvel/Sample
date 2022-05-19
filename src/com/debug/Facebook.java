package com.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver .get("https://www.facebook.com");
		WebElement btncreatacct = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btncreatacct.click();
		Thread.sleep(2500);
		WebElement txtfirstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		txtfirstname.sendKeys("nesa");
		WebElement txtlastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		txtlastname.sendKeys("priya");
		

}
}
