package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class rightto {
	
	private static final WebElement RightClickMenu = null;
	static RemoteWebDriver driver;
	// TODO Auto-generated method stub
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/Users/rahulbajaj/Downloads/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");
	driver.manage().window().maximize();
	// TODO Auto-generated method stub
	Thread.sleep(6000);
	WebElement Picture=driver.findElement(By.xpath("//*[@style='cursor: pointer;'"));
	Actions obj= new Actions(driver);
	obj.contextClick(RightClickMenu);
	
	}

}
