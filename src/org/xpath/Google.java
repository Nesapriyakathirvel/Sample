package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement txtfname =	driver.findElement(By.xpath("//input[@id='firstName']"));
		txtfname.sendKeys("nesa");
		WebElement txtlname = driver.findElement(By.xpath("//input[@id='lastName']"));
		txtlname.sendKeys("priya");
		WebElement txtmail= driver.findElement(By.xpath("//input[@id='username']"));
		txtmail.sendKeys("nesa.05");
		WebElement txtpassword = driver.findElement(By.xpath("//input[@name='Passwd']"));
		txtpassword.sendKeys("123456");
		WebElement txtcpassword = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		txtcpassword.sendKeys("456789");
	}
}

