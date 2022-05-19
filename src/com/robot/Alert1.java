package com.robot;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement btntextbox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		btntextbox.click();
		WebElement btnpromptbox = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		btnpromptbox.click();
		Alert  al = driver.switchTo().alert();
		al.sendKeys("nesa");
		al.accept();
		WebElement txtprint= driver.findElement(By.id("demo1"));
		String text = txtprint.getText();	
		System.out.println(text);
	}
}
