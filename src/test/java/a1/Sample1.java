package a1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample1{
	WebDriver driver;
	
	@When("user open chrome browser and opens application")
	public void user_open_chrome_browser_and_opens_application() {
		System.out.println("d");
	}

	@When("user entering username as {string} And password as {string}  field")
	public void user_entering_username_as_And_password_as_field(String string, String string2) {

	System.out.println("e");
	}

	@When("user clicks login")
	public void user_clicks_login() {
	    System.out.println("e");
	}

	@Then("verify")
	public void verify() {
	    System.out.println("p");
	}

}