package distanceCalculator;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class distanceCalculator {
	WebDriver driver;

	
	
  @Test
  public void vilniusToKaunas() {
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
  }

}
