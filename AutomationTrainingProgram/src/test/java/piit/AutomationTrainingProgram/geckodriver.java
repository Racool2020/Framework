package piit.AutomationTrainingProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class geckodriver { 

	//WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		


		Browsers("Chrome");  
	}
	WebDriver driver;

	
	public void Browsers(String window)   {

		if(window.equalsIgnoreCase("Chrome"))  {
		System.setProperty("webdriver.chrome.driver", "/Users/qaisrahmani/Downloads/chromedriver");
		 driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
	
		}
		else if (window.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.edge.driver", "/Users/qaisrahmani/Downloads/msedgedriver");
		driver=new EdgeDriver();
		driver.navigate().to("https://www.amazon.com");
		}
		
	
		else if (window.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "/Users/qaisrahmani/Downloads/geckodriver");
		driver=new FirefoxDriver();
		driver.navigate().to("https://www.amazon.com");
		}
	}
	}