package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		WebElement btnsign = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		btnsign.click();
		WebElement txtnum = driver.findElement(By.xpath("//input[@id='mobile']"));
		txtnum.sendKeys("9823562791");
		WebElement txtname = driver.findElement(By.xpath("//input[@id='name']"));
		txtname.sendKeys("nesa");
		WebElement txtmail = driver.findElement(By.xpath("//input[@id='email']"));
		txtmail.sendKeys("nesa@gmail.com");
		WebElement txtpassword = driver.findElement(By.xpath("//input[@id='password']"));
		txtpassword.sendKeys("syod");
		//driver.quit();
}
}