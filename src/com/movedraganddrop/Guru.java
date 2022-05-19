package com.movedraganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement s = driver.findElement(By.id("credit2"));
		WebElement d = driver.findElement(By.id("bank"));
		Actions action=new Actions(driver);
		action.dragAndDrop(s, d).perform();//---------------bank
		WebElement s1 = driver.findElement(By.id("fourth"));
		WebElement d1 = driver.findElement(By.id("amt7"));
		Actions action1=new Actions(driver);
		action1.dragAndDrop(s1, d1).perform();//-----------amount
		WebElement s2 = driver.findElement(By.id("credit1"));
		WebElement d2 = driver.findElement(By.id("loan"));
		Actions action2=new Actions(driver);
		action2.dragAndDrop(s2, d2).perform();//------------------------sales
		WebElement s3 = driver.findElement(By.id("fourth"));
		WebElement d3 = driver.findElement(By.id("amt8"));
		Actions action3=new Actions(driver);
		action3.dragAndDrop(s3, d3).perform();//------------amount
		WebElement txt = driver.findElement(By.xpath("//div[@class='table4_result']"));
		String text = txt.getText();
		System.out.println(text);
		
		
	}
}
