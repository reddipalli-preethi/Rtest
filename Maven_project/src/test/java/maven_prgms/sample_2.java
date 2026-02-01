package maven_prgms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class sample_2 {
	public static void main(String args[]) throws InterruptedException {
		System.out.println("Hello Everyone");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
	//	Thread.sleep(3000);
		driver.quit();
}	
	}
