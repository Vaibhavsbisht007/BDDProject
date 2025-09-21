package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	static WebDriver driver;
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {		
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.saucedemo.com/");	
	}

	@When("user enter the {string} and {string}")
	public void user_enter_the_user_name_and_password(String user_name, String Password) {	  
		driver.findElement(By.id("user-name")).sendKeys(user_name);
		driver.findElement(By.id("password")).sendKeys(Password);		
	}
	
	@And("user click on the Button")
	public void user_click_on_the_button() {
	driver.findElement(By.id("login-button")).click();	
	}

	
@Then("user log in successfully")
public void user_log_in_successfully() {
	Assert.assertTrue(driver.findElements(By.xpath("//*[@class=\"app_logo\"]")).size()>0,"User is on the homepage");
	
	}

	@And("close the browser")
	public void close_the_browser() {
		driver.close();
		
	}
	
}
