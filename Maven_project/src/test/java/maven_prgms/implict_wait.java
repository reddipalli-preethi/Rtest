package maven_prgms;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class implict_wait {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://demoqa.com/dynamic-properties");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        System.out.println(driver.findElement(By.id("visible After")).getText());
        Thread.sleep(3000);
        driver.quit();
}
}
