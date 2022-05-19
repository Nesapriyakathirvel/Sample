package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {//---------------------frame
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/ ");
		driver.manage().window().maximize();
		WebElement btnhead= driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
		btnhead.click();
		WebElement btnsigin = driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']"));
		btnsigin.click();
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(iframe);
		WebElement txtnum = driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		txtnum.sendKeys("9597686295");
		
}
	}
