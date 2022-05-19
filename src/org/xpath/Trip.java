package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trip {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		WebElement txtfrom = driver.findElement(By.id("from_station"));

		txtfrom.sendKeys("dharmapuri");
		WebElement txtto = driver.findElement(By.id("to_station"));
		txtto.sendKeys("chennai");
		WebElement btnsearch = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		btnsearch.click();



	}
}
