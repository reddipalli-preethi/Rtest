package bdd_programs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testlogin {


	package stepdefinitions;

	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.cucumber.java.en.*;

	public class testlogin {
		WebDriver driver;
		
		@Given("chrome browser is open")
		public void chrome_browser_is_open() {
			driver = new ChromeDriver();
	        driver.manage().window().maximize();
		}

		@Given("user is on login page")
		public void user_is_on_login_page() {
			driver.navigate().to("https://saucedemo.com/");
		}

		@When("user enters (.*) and (.*)$")
		public void user_enters_sriram_and(String username, String password) {
			driver.findElement(By.id("user-name")).sendKeys(username);
		    driver.findElement(By.id("password")).sendKeys(password);
		}

		@When("user clicks on login")
		public void user_clicks_on_login() {
			driver.findElement(By.id("login-button")).click();
		}

		@Then("user is navigated to home page")
		public void user_is_navigated_to_home_page() throws InterruptedException {
			Thread.sleep(2000);
		    driver.quit();
		}
	}


