package page_obj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import obj_page_model.loginpagefactory;

public class login_factory_1 {


	public static void main(String args[]) throws InterruptedException {
		WebDriver driver;
		loginpagefactory loginpagefactory;
		  
		driver =  new ChromeDriver();
		loginpagefactory = new loginpagefactory(driver);
		
		loginpagefactory.navigateTO();
		loginpagefactory.login("Invalid_user","wrong_password");
		Thread.sleep(2000); 
		
		loginpagefactory.navigateTO();
		loginpagefactory.login("standard_user", "secret_sauce");
		Thread.sleep(2000);
		
		
		
		driver.quit();
	}
}

