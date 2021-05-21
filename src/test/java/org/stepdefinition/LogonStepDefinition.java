package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogonStepDefinition {
	WebDriver driver;

	@Given("User have to enter into facebook login page")
	public void user_have_to_enter_into_facebook_login_page() {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@When("User enter invalid username {string} and passwork{string}")
	public void user_enter_invalid_username_and_passwork(String user, String pass) {
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys(user);
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys(pass);
	

	
	}

	@When("User have to click login button")
	public void user_have_to_click_login_button() {
		
		driver.findElement(By.name("login")).click();

	}

	@Then("User should be invalid credentials page")
	public void user_should_be_invalid_credentials_page() throws InterruptedException {
		
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.contains("privacy_mutation_token")) {
			System.out.println("user in invalid page");
		}
		
		
		Thread.sleep(2000);
		
driver.close();
	}

}
