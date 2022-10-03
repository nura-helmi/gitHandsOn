package handsonTestNG;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.openqa.selenium.WebDriver;
//import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class testNGHANDSON {

	WebDriver driver ;

	  @Test
	  public void f() {
		    String baseUrl = "https://www.toolsqa.com/";
	        System.out.println("Launching Google Chrome browser"); 
	        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get(baseUrl);
	        String testTitle = "Tools QA";
	        String originalTitle = driver.getTitle();
	        Assert.assertEquals(originalTitle, testTitle);
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  //BasicConfigurator.configure();
		  System.out.println("Starting Test On Chrome Browser");
	  }

	  @AfterMethod
	  public void afterMethod() {
			driver.close();
			System.out.println("Finished Test On Chrome Browser");
	  }
}
