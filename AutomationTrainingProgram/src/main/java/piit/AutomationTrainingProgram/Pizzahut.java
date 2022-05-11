package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Pizzahut {
	static RemoteWebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/Users/rahulbajaj/Downloads/chromedriver");
			ChromeDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.pizzahut.com");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[text()='Select & Continue']"));
			//Click on menu
			
			WebElement MenuTab=driver.findElement(By.className("MuiButton-label"));
			MenuTab.click();
			Thread.sleep(2000);
			
			//choose pizza from the drop down menu
			
			WebElement PizzaChoice=driver.findElement(By.xpath("//*[@data-testid='menu-pizza-link']"));
			PizzaChoice.click();
			
			
			//click on popular pizza 
			
			WebElement PopularPizza=driver.findElement(By.xpath("//*[@class= 'btn btn-lg btn-link ph-titlecase ng-binding ng-scope ph-active-ectioon']"));
			PopularPizza.click(); 
	}

}

