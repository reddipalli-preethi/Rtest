package css_prgms;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class navigation_keys {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		WebElement l = driver.findElement(By.name("q"));
		Actions a = new Actions(driver);
		a.moveToElement(l).click();
		a.keyDown(Keys.SHIFT);
		a.sendKeys("animal").keyUp(Keys.SHIFT).build().perform();
		a.sendKeys(Keys.ENTER);
		a.contextClick().perform();
		//driver.quit();
				
}
}
