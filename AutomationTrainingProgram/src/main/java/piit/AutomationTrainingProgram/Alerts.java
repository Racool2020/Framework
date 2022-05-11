package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rahulbajaj/Downloads/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement Alert=driver.findElement(By.name("alert"));	
		Alert.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		WebElement prompting=driver.findElement(By.name("prompt"));
		prompting.click();
		Thread.sleep(6000);
		driver.switchTo().alert().sendKeys("tested");
		driver.switchTo().alert().dismiss();
	}

}
