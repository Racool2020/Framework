package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class KeyToFunctions {
static RemoteWebDriver driver;

		// TODO Auto-generated method stub
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/Users/rahulbajaj/Downloads/chromedriver");
			ChromeDriver driver = new ChromeDriver();
			driver.navigate().to("https://amazon.com");
			driver.manage().window().maximize();
			WebElement searchtofield=driver.findElement(By.id("twotabsearchtextbox"));
			searchtofield.sendKeys("Computer");
			Actions ob=new Actions(driver);
			ob.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).build().perform();
			Thread.sleep(6000);
			ob.keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).build().perform();
			searchtofield.clear();
			Thread.sleep(6000);
			searchtofield.click();
			ob.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).build().perform();
			

	}

}
