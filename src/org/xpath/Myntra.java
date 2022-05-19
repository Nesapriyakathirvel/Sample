package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {//-----------------------partial output
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
	WebElement txtnum = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
	txtnum.sendKeys("9597686295");
	WebElement btnc = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
	btnc.click();
	//driver.quit();
}
}
