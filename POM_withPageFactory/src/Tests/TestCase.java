package Tests;

import org.testng.annotations.Test;

import Pages.flightsPage;
import Pages.registerPage;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class TestCase {
	
	String drivepath ="C:\\Selenium\\chromedriver_win32\\chromedriver.exe";	
	WebDriver driver;
	//registerPage objRegister;
	//FlightsPage objFlights;
 
  @BeforeMethod
  public void setup() {
	  
	  System.setProperty("webdriver.chrome.driver", drivepath);
      
      driver = new ChromeDriver();

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.get("http://newtours.demoaut.com/");
      
      
  }
  	
	
  @Test(priority=0)

  public void test_UserRegister() throws InterruptedException{
	  
	  driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
	  
	  registerPage objRegister = PageFactory.initElements(driver, registerPage.class);
	  objRegister.signupBlock1("Demo", "User", "9000989010", "aarthy.587@gmail.com");
	  objRegister.signupBlock2("569,Duane Street", "Gname", "mercury", "mercury");
	  Thread.sleep(2000);
	  String bodyText = driver.findElement(By.tagName("body")).getText();
  if(bodyText.contains("Thank you for registering")) {
    	  System.out.println("Registration is Successfull");
      }else
      {
          System.out.println("Test Case Fail");
      }
  }
  
  @Test(priority=1)
  public void test_FlightsBooking() throws InterruptedException {
	  
	  flightsPage objFlights = PageFactory.initElements(driver,flightsPage.class);
	  objFlights.signIn("admin", "mercury");
	  Thread.sleep(2000);
	  Assert.assertTrue(objFlights.verifyBasePageTitle(),"Title doesnt match");	  
	   
	  
  }
 

  @AfterMethod
  public void closeBrowser() {
	  driver.close();
  }
  @AfterSuite
  public void Teardown() {
	  driver.quit();
  }

}
