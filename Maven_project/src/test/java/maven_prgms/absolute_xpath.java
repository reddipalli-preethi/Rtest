package maven_prgms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class absolute_xpath {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/header/div[1]/div[1]/a")).click();
	 driver.quit();
	}
}