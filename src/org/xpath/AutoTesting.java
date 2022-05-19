package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTesting {
	//----------------pending
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get(" http://demo.automationtesting.in/Register.html");
			Thread.sleep(2000);
		WebElement txtfirst = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));	
			txtfirst.sendKeys("nesa");
			WebElement txtlast = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
			txtlast.sendKeys("priya");
			WebElement txtadd = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
			
			txtadd.sendKeys("harrur,dharmapuri");
			WebElement txtmail= driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
			txtmail.sendKeys("nesapriya.05@gmail.com");
			WebElement txtphone= driver.findElement(By.xpath("//input[@ng-model='Phone']"));
			txtphone.sendKeys("9597686295");
			WebElement btnradio = driver.findElement(By.xpath("//input[@value='FeMale']"));
			btnradio.click();
			WebElement ckbox1 = driver.findElement(By.xpath("//input[@value='Cricket']"));
			ckbox1.click();
			WebElement ckbox2 = driver.findElement(By.xpath("//input[@value='Movies']"));
			ckbox2.click();
			WebElement ckbox3 = driver.findElement(By.xpath("//input[@value='Hockey']"));
			ckbox3.click();
			WebElement txtpassword = driver.findElement(By.xpath("//input[@ng-model='Password']"));
			txtpassword.sendKeys("poi");
			WebElement txtcpassword = driver.findElement(By.xpath("//input[@ng-model='CPassword']"));
			txtcpassword.sendKeys("poi");
			

			
			
		}

}

