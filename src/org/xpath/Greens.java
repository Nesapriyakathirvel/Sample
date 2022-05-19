package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get("http://greenstech.in/selenium-course-content.html\r\n");
		WebElement btninterview = driver.findElement(By.xpath("//div[@id='heading20']"));
		btninterview.click();
		WebElement btncts = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		btncts.click();
		driver.quit();
		
}
}
