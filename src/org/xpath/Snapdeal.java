package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main(String[] args) {//----------------frame 


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement btnsigin = driver.findElement(By.xpath("//div[@class='accountInner']"));
		btnsigin.click();
		WebElement btnregister = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		btnregister.click();
		WebElement element = driver.findElement(By.xpath("//iframe[@name='iframeLogin']"));
		driver.switchTo().frame(element);
		WebElement txtnum = driver.findElement(By.xpath("//input[@id='userName']"));
		txtnum.sendKeys("9597686295");
//		WebElement btncontinue = driver.findElement(By.xpath("//button[@id='checkUser']"));
//		btncontinue.click();
	}
}
