package piit.AutomationTrainingProgram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Windowsk {
	static RemoteWebDriver driver;
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/Users/rahulbajaj/Downloads/chromedriver");
			ChromeDriver driver = new ChromeDriver();
			driver.navigate().to("https://amazon.com/");
			driver.manage().window().maximize();
			Actions ob=new Actions(driver);
			WebElement newreleaseslinks=driver.findElement(By.linkText("New Releases"));
			ob.keyDown(Keys.SHIFT).build().perform();
			newreleaseslinks.click();
			ob.keyUp(Keys.SHIFT).build().perform();
			driver.getWindowHandle();
			Set<String> windowhandles= driver.getWindowHandles();
			Iterator<String> iterators=windowhandles.iterator();
			String Parent= iterators.next();
			String secondwindow= iterators.next();
			System.out.println("This is parent window ="+Parent);
			System.out.println("This is second window ="+secondwindow);
			driver.switchTo().window(secondwindow);
			WebElement Products=driver.findElement(By.linkText("Camera & Photo Products"));
			Thread.sleep(6000);
			Products.click();
			
	}

}
