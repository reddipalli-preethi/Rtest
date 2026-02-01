package page_obj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import obj_page_model.loginpage;

public class login_page1 {

	public static void main(String args[]) {
		WebDriver driver;
		loginpage loginpage;
		  
		driver =  new ChromeDriver();
		loginpage = new loginpage(driver);
		
		loginpage.navigateTO();
		loginpage.login("standard_user", "secret_sauce");
		//Thread.sleep(2000);
		
		loginpage.navigateTO();
		loginpage.login("Invalid_user","wrong_password");
		//Thread.sleep(2000); 
		
		driver.quit();
	}
}
