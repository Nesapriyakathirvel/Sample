package org.textget;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getvalue {public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	WebElement txtuser = driver.findElement(By.xpath("//input[contains(@id,'username')]"));
	txtuser.sendKeys("nesa");
	String attribute = txtuser.getAttribute("value");
	System.out.println(attribute);

}
}
