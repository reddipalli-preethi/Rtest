package maven_prgms;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sample_search {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		WebElement sb= driver.findElement(By.id("q"));
		sb.sendKeys("india");
		sb.sendKeys(Keys.ENTER);
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
}
}