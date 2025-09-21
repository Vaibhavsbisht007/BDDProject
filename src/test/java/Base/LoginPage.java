package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);		
	}
	
	@FindBy(id="user-name")
	private WebElement username;

	@FindBy(id="password")
	private WebElement password;

	@FindBy(id="login-button")
	private WebElement button;

	@FindBy(xpath="\"//*[@class=\\\"app_logo\\\"]\"")
	private WebElement logo;		

	public void enterUsername(String name) {
		username.sendKeys(name);
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void enterButton() {
		button.click();
	}

	
}
