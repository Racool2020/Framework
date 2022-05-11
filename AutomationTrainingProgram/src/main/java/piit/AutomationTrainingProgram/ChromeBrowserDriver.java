package piit.AutomationTrainingProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDriver {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rahulbajaj/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		String ur= driver.getCurrentUrl();
		System.out.println(ur);
		String windowhandle=driver.getWindowHandle();
		System.out.println(windowhandle);
		driver.close();
	}

}
