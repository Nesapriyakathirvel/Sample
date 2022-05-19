package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver .get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		//username
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("Nesapriya");
		//password
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("Kioo@2706");
		//login
		WebElement btnlogin= driver.findElement(By.id("login"));
		btnlogin.click();
		//dropdown-location
		WebElement dDnlocation = driver.findElement(By.id("location"));
		Select select=new Select(dDnlocation);
		select.selectByIndex(1);
		//dropDown-hotels
		WebElement dDnhotel = driver.findElement(By.id("hotels"));
		Select select1=new Select(dDnhotel);
		select1.selectByIndex(1);
		//dropDown-room
		WebElement dDnroom = driver.findElement(By.id("room_type"));
		Select select2=new Select(dDnroom);
		select2.selectByIndex(1);
		//dropDown-numroom
		WebElement dDnnumroom = driver.findElement(By.id("room_nos"));
		Select select3=new Select(dDnnumroom);
		select3.selectByIndex(1);
		//dropDown-Adultroom
		WebElement dDnAdult = driver.findElement(By.id("adult_room"));
		Select select4=new Select(dDnAdult);
		select4.selectByIndex(1);
		//dropDown-children
		WebElement dDnchildren = driver.findElement(By.id("child_room"));
		Select select5=new Select(dDnchildren);
		select5.selectByIndex(1);
		//search
		WebElement btnsearch = driver.findElement(By.id("Submit"));
		btnsearch.click();
		//radiobutton
		WebElement btnradio = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		btnradio.click();
		//continue
		WebElement btncontinue = driver.findElement(By.xpath("//input[@name='continue']"));
		btncontinue.click();
		//firstname
		WebElement txtfname = driver.findElement(By.xpath("//input[@name='first_name']"));
		txtfname.sendKeys("nesa");
		//lastname
		WebElement txtlname = driver.findElement(By.xpath("//input[@name='last_name']"));
		txtlname.sendKeys("priya");
		//address
		WebElement txtaddress = driver.findElement(By.xpath("//textarea[@id='address']"));
		txtaddress.sendKeys("harur,Dharmapuri");
		//credit
		WebElement txtcredit = driver.findElement(By.xpath("//input[@name='cc_num']"));
		txtcredit.sendKeys("1234567891234567");
		//cvv
		WebElement txtcvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		txtcvv.sendKeys("444");
		//creditcardtype
		WebElement dDncardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select select6=new Select(dDncardtype);
		select6.selectByIndex(1);	
		//month
		WebElement dDnmonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select select7=new Select(dDnmonth);
		select7.selectByIndex(1);	
		//year
		WebElement dDnyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select select8=new Select(dDnyear);
		List<WebElement> options = select8.getOptions();
	   int size = options.size();
	   select8.selectByIndex(size-1);
		//----booknow
		WebElement btnbooknow = driver.findElement(By.xpath("//input[@name='book_now']"));
		btnbooknow.click();
		Thread.sleep(5000);
		//ordernumber
		WebElement txtorder = driver.findElement(By.xpath("//input[@id='order_no']"));
		String attribute = txtorder.getAttribute("value");
		System.out.println(attribute);
		
		
		

	}
}
	
