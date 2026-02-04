package coding_assessment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class times {
	WebDriver driver;
	@Given("browser is open")
	public void browser_is_open() throws  InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://timesofindia.indiatimes.com/defaultinterstitial.cms?b=/");
	    Thread.sleep(2000);
	}

	@Given("user is on times india page")
	public void user_is_on_times_india_page() {
		driver.get("https://timesofindia.indiatimes.com/");
	}

	@When("user clicks on the dropdown")
	public void user_clicks_on_the_dropdown() {
		driver.findElement(By.xpath("//li[@data-newga='switch_country#switch_country_hindi']")).click();
	}

	@Then("user selects language and show results")
	public void user_selects_language_and_show_results() throws InterruptedException {
		  
				Thread.sleep(3000);
					driver.quit();
				}
	}



