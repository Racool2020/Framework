package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Flights {
	private static final WebElement Departuretodate = null;
	static RemoteWebDriver driver;
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/Users/rahulbajaj/Downloads/chromedriver");
			ChromeDriver driver = new ChromeDriver();
			driver.navigate().to("https://expedia.com/");
			driver.manage().window().maximize();
			WebElement departure=driver.findElement(By.id("d1-btn"));
			departure.click();
			WebElement Departuretodate=driver.findElement(By.xpath("//*[@aria-label='May 16, 2022']"));
			Departuretodate.click();		

	}

}
