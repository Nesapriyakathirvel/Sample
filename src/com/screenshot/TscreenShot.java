package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TscreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get("https://www.facebook.com");
		driver.manage().window().maximize();//--------------type casting
		TakesScreenshot screenshot=(TakesScreenshot) driver; 
		File s = screenshot.getScreenshotAs(OutputType.FILE);
		File d=new File("C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Img/login.png");
		FileUtils.copyFile(s,d);				
	}
}
