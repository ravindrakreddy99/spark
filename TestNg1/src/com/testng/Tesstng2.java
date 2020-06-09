package com.testng;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tesstng2 {
   WebDriver driver = new ChromeDriver();
   
   @BeforeTest
   public void launchapp() {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\chromedriver.exe");
      // Puts an Implicit wait, Will wait for 10 seconds before throwing exception
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      // Launch website
      driver.navigate().to("https://letskodeit.teachable.com");
      driver.manage().window().maximize();
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
   
   
   @AfterTest
   public void terminatetest() {
      driver.close();
   }
}