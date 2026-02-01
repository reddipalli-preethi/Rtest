package maven_prgms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class drop_down {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
		WebElement drpdwn=driver.findElement(By.name("country"));
		Select sc=new Select(drpdwn);
		
		sc.selectByVisibleText("INDIA");
		
		Thread.sleep(2000);
		boolean  b1nDisplayed=drpdwn.isDisplayed();
		boolean b1nEnabled=drpdwn.isEnabled();
		
		Thread.sleep(3000);
		sc.selectByValue("AFRICA");
		
		Thread.sleep(3000);
		sc.selectByIndex(1);
		
		Thread.sleep(3000);
		System.out.println("Dropdown Displayed:"+b1nDisplayed);
		System.out.println("Dropdown Enabled:"+b1nEnabled);
		driver.quit();
		
}
}
