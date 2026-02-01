package page_obj;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import obj_page_model.google_search;

public class google_search_page {
	static WebDriver driver;
	public static void main(String args[]) {
		googlesearch();
		driver.quit();
	}
	private static void googlesearch() {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		  
		google_search.textbox_search(driver).sendKeys("Animal");
		google_search.textbox_search(driver).sendKeys(Keys.ENTER);
		google_search.textbox_search(driver).click();
		
		
	}

}
