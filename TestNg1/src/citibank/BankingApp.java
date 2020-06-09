package citibank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BankingApp {
	 public String baseUrl = "https://www.online.citibank.co.in/";
	    String driverPath = "C:\\Users\\hi\\eclipse-workspace\\chromedriver.exe";
	    public WebDriver driver ; 
	     
	     @BeforeTest
	      public void launchBrowser() {
	          System.out.println("launching firefox browser"); 
	          System.setProperty("webdriver.chrome.driver", driverPath);
	          driver = new ChromeDriver();
	          driver.get(baseUrl);
	     }
	    
}    


