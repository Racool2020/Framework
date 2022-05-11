package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	private static final WebElement Passwords = null;
	WebDriver driver;
	@FindBy(name="email")
	static WebElement Ids;
	@FindBy(name="password") WebElement Psswords;
	@FindBy(linkText="Forgot password") WebElement Forgot;
	private WebDriver driver1;
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	public static void Email() {
		Ids.sendKeys("John");
}
	public void PasswordFieldsEnters() {
		Passwords.sendKeys("Silver");
	}
	public void ForgotLinkClick() {
		Forgot.click();
	}
}
