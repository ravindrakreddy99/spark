package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Testng2 {
	WebDriver driver;
	String baseurl;
	
	

	public void setUp() {
		baseurl ="https://letskodeit.teachable.com";
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\chromedriver.exe");
		driver=new ChromeDriver();
		
		}
		@Test
		public void testLogin() throws InterruptedException {
			WebElement loginlink = driver.findElement(By.xpath("//a[contains(@href,'/sign_in')]"));
			
			loginlink.click();
			WebElement emailfield = driver.findElement(By.id("user_email"));
			emailfield.sendKeys("gmail@com");
			WebElement pwdfield = driver.findElement(By.id("user_password"));
			pwdfield.sendKeys("arfff");
			WebElement loginButton = driver.findElement(By.id("commit"));
			loginButton.click();

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	


