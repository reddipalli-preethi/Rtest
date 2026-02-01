package maven_prgms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class relativex_sample {
	public static void main(String args[]) throws InterruptedException {
		System.out.println("Hello Everyone");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		//System.out.println(driver.getTitle());
	    driver.findElement(By.linkText("Images")).click();
		driver.findElement(By.xpath("//a[@name=data-pid='2'and @aria-label='Search for Images ']")).click();
		driver.quit();
	

}

}
