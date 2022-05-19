  package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WSreenShot {
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.moneycontrol.com/markets/fno-market-snapshot");
	WebElement btntextbox = driver.findElement(By.xpath("//div[@class='twoCol MT20 clearfix no_brd']"));
	File s = btntextbox.getScreenshotAs(OutputType.FILE);
	File d=new File("C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Img/login.png");
	FileUtils.copyFile(s,d);		
}
}