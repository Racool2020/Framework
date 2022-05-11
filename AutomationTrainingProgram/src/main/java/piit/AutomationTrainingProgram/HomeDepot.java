package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class HomeDepot {
	static RemoteWebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/Users/rahulbajaj/Downloads/chromedriver");
			ChromeDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.homedepot.com");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@class='My Account__button']")).click();
			//driver.findElement(By.xpath("//*[@class='bttn__content']")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//*[contains(text(),'Register')]")).click();
			driver.findElement(By.xpath("//*[@class='bttn_content'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='email' and @class ='form-input_field' ]")).click();
			driver.findElement(By.xpath("//*[@id='email' and @class ='form-input_field' ]")).click();
			driver.findElement(By.xpath("//*[@id='email' and @class ='form-input_field' ]")).sendKeys("/Users/rahulbajaj/Downloads/chromedriver");
			Thread.sleep(2000);
			driver.findElement(By.id("zipCode")).sendKeys("20123");
			driver.findElement(By.id("phone")).sendKeys("646900");
			
			
			Thread.sleep(2000);
			
			driver.quit();
			
	}

}

