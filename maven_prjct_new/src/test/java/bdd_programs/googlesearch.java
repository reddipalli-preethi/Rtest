package bdd_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googlesearch {
	WebDriver driver;
	
	@Given("browser is open")
     public void browser_is_open() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
	}
	
	@Given("user is on google search page")
     public void user_is_on_google_search_page()  {
		driver.navigate().to("https://www.google.com");
	}
	
	@When("user enters a text in search box")
     public void user_enters_a_text_in_search_box() {     
		driver.findElement(By.name("q")).sendKeys("Animal");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	
	@Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() throws InterruptedException {
		Thread.sleep(3000);
			driver.quit();
		}
	
	

}
