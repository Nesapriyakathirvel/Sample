package com.robot;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleRightClick {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenscart.in/");
		Thread.sleep(2500);
		WebElement txtmail = driver.findElement(By.xpath("//input[@id='loginEmailId']"));
		txtmail.sendKeys("nesapriya.05@gmail.com");
		WebElement txtpassword = driver.findElement(By.xpath("//input[@id='loginPassword']"));
		txtpassword.sendKeys("Kioo@2706");
		WebElement btnlogin = driver.findElement(By.xpath("//input[@class='btnRegister form-control']"));
		btnlogin.click();
		Thread.sleep(2500);
		WebElement lnkseemore = driver.findElement(By.xpath("//a[@class='btn btn-default float-right']"));
		lnkseemore.click();
		WebElement lnkrealme = driver.findElement(By.xpath("//img[@src='https://fdn2.gsmarena.com/vv/pics/realme/realme-7-pro-1.jpg']"));
		lnkrealme.click();
		WebElement btnbye = driver.findElement(By.xpath("//button[text()='Buy Now']"));
		btnbye.click();
		WebElement btngift = driver.findElement(By.xpath("//button[text()='ADD GIFT CODE']"));
		btngift.click();
		WebElement lnkpromocode = driver.findElement(By.xpath("//span[text()='GRN10']"));
		Thread.sleep(3500);
        Actions action=new Actions(driver);
        action.doubleClick(lnkpromocode).perform();     
         WebElement btnclose = driver.findElement(By.xpath("//span[@class='px-1 close']"));
        action.contextClick(btnclose).perform();
        WebElement lnkremove = driver.findElement(By.xpath("//div[text()='Remove Promo Code ']"));
        lnkremove.click();
		
		
		
		
	}
	
}
