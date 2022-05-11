package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {

private static final WebElement Sorting = null;

public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "/Users/rahulbajaj/Downloads/chromedriver");
			ChromeDriver driver = new ChromeDriver();
			driver.navigate().to("https://jqueryui.com/droppable");
			driver.manage().window().maximize();
			//WebElement dropable=driver.findElement(By.linkText("Droppable"));
			//dropable.click();
			driver.switchTo().frame(0);
			WebElement ElementToDrag=driver.findElement(By.id("draggable"));
			WebElement DropToHere=driver.findElement(By.id("droppable"));
			Actions ob=new Actions(driver);
			ob.dragAndDrop(ElementToDrag, DropToHere).build().perform();
			driver.switchTo().parentFrame();
			WebElement Soorting=driver.findElement(By.id("Sortable"));
			Sorting.click();
	}

}
