package obj_page_model;

 import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
 
public class google_search {
	private static WebElement element = null;
	public static WebElement textbox_search(WebDriver driver) 
	{
		element = driver.findElement(By.name("q"));
		return element;
	}
	/*public static WebElement button_search(WebDriver driver)
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSecond)*/
	
	

}
