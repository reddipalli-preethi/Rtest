package css_prgms;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class drag_drop_a {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com");		
		Thread.sleep(3000);
		WebElement From=driver.findElement(By.xpath("//a[@aria-label='Gmail' or @data-pid='23']"));
		WebElement To=driver.findElement(By.xpath("//textarea[@class='gLFyf' or @aria-controls='Alh6id']"));
		Actions ac=new Actions(driver);
		ac.dragAndDrop(From, To).sendKeys(Keys.ENTER).build().perform();
		
		driver.quit();
		
}
}
