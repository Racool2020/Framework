package piit.AutomationTrainingProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class Browsersd {
	RemoteWebDriver driver;
  @Test
public void f() {
	  WebElement id=driver.findElement(By.name("email"));
	  id.sendKeys("Silem@piit");
	  WebElement password=driver.findElement(By.name("pass"));
	  password.sendKeys("johnsilver");
	  WebElement loginbutton=driver.findElement(By.name("loginbutton"));
	  loginbutton.click();
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "/Users/rahulbajaj/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("https://facebook.com/");
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
