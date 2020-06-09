package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest2  {
	@BeforeTest
	public void beforeT() {
		System.out.println("beforetest");
	}
	@AfterTest
	public void afterT() {
		System.out.println("aftertest");
	}
	
	
	@BeforeClass
	public void before() {
		System.out.println("beforeClass");
	}
	@AfterClass
	public void after() {
		System.out.println("afterClass");
	}
	@BeforeMethod
	public void beforeM() {
		System.out.println("beforeMethod");
	}
	
	@AfterMethod
	public void afterM() {
		System.out.println("AfterMethod");
	}
	/*@Test(groups= {"cars"})
	public void testAudi() {
		System.out.println("money1");
	}
	
		@Test(groups= {"bikes"})
		public void testHonda() {
			System.out.println("money2");
		}
		
		
			@Test(groups= {"bikes"})
			public void testNano() {
				System.out.println("money3");
	}*/
	
			
			
			
			
			
			
			
			
}
