package org.textget;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	WebElement btnoverview = driver.findElement(By.xpath("//a[@id='overview-tab']"));
	btnoverview.click();
	Thread.sleep(2500);
    WebElement txtf = driver.findElement(By.xpath("//div[@id='collapse661']"));
	String text = txtf.getText();
	System.out.println(text);
	//driver.quit();
	
}
}
