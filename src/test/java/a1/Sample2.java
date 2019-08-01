package a1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample2 {
	WebDriver driver;

	@Given("welcome user")
	public void welcome_user() {
		
	}
	    
	

	@When("user opens chrome browser and open application")
	public void user_opens_chrome_browser_and_open_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdrivers\\chromedriver.exe");

		driver= new ChromeDriver();

		driver.get("http://newtours.demoaut.com");
	    
	}

	@When("user enters username as {string} And password as {string}  field")
	public void user_enters_username_as_And_password_as_field(String string, String string2) {
		driver.findElement(By.name("userName")).sendKeys("mercury");

		driver.findElement(By.name("password")).sendKeys("mercury");

	   
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		driver.findElement(By.name("login")).click();
	    
	}

	@Then("verify the login")
	public void verify_the_login() {
		Assert.assertTrue(driver.getTitle().contains("Flight"));


		driver.close();

	    
	}
}

	