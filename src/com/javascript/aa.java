package com.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class aa {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		WebElement txtuser=driver.findElement(By.id("email"));
		JavascriptExecutor je =(JavascriptExecutor)driver;
		je.executeScript("arguments[0].setAttribute('value','nesa')",txtuser);
		Object name = je.executeScript("return arguments[0].getAttribute('value')", txtuser);
		System.out.println(name);

		WebElement txtpassword=driver.findElement(By.id("pass"));
		je.executeScript("arguments[0].setAttribute('value','kioo')",txtpassword);
		Object password = je.executeScript("return arguments[0].getAttribute('value')", txtuser);
		System.out.println(password);
  	
  	
		WebElement btnlogin=driver.findElement(By.name("login"));
  	    je.executeScript("arguments[0].click()",btnlogin);
  	
  	
  	
	}

}
