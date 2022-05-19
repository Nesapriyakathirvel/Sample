package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(" https://www.amazon.in/");
        WebElement txtpro = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        txtpro.sendKeys("iphone");
        WebElement btnsearch = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        btnsearch.click();
        driver.quit();
        
	}

}
