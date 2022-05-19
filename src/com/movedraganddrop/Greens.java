package com.movedraganddrop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Greens {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	WebElement lnkcourse = driver.findElement(By.xpath("//div[@title='Courses']"));
	Actions action=new Actions(driver);
	action.moveToElement(lnkcourse).perform();
	WebElement element2 = driver.findElement(By.xpath("//span[text()='Master Program (8)']"));
	action.moveToElement(element2).perform();
	
	List<WebElement> lnkmasterprm = driver.findElements(By.xpath("//span[text()='Master Program (8)']//parent::div[@title='Master Program']//following-sibling::div[@class='dropdown-menu sub dropdown-menusub_inner']//child::ul[@class='browse-sub-menu-custom']"));
	for (WebElement webElement : lnkmasterprm) {
		System.out.println(webElement.getText());
	}
	WebElement element3= driver.findElement(By.xpath("//div[@title='Data Science']"));
	action.moveToElement(element3).perform();
	
	
	WebElement element4= driver.findElement(By.xpath("//div[@title='Oracle']"));
	action.moveToElement(element4).perform();
	WebElement findElement = driver.findElement(By.xpath("//div[@class='dropdown-menu sub dropdown-menusub_inner']"));
	String text = findElement.getText();
	System.out.println(text);

	
}
}