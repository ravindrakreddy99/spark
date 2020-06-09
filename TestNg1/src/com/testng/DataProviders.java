package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	@DataProvider(name="inputs")
	public Object[][] getData(){
		return new Object[][] {
			{"bmw","b3"},
			{"audi","b6"},
			{"nano","a1"},
		};
	}	
	@Test(dataProvider="inputs")
	public void testMethod1(String input1, String input2)
	{
		System.out.println("input1:" +input1);
		System.out.println("input2:" +input2);

	}
	
		
}

