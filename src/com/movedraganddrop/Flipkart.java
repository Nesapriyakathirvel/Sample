package com.movedraganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {//---------incomplit
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement btnclose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnclose.click();
		WebElement lnkelectronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
		Actions action=new Actions(driver);
		action.moveToElement(lnkelectronics).perform();
	//	WebElement lnkelectronics = driver.findElement(By.linkText(""));
		//WebElement txtlap = driver.findElement(By.xpath("//h1[text()='Laptop Store 2022']"));
	//String text = txtlap.getText();
	//     n  System.out.println(text);
}
}
