package obj_page_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class new_tab {

	public static void main(String args[]) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.google.com");
		String initalHandle = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://www.google.com/lmghp?h1=en&ogb1");
		System.out.println(driver.getWindowHandles().size());
		driver.switchTo().window(initalHandle);
		Thread.sleep(2000);
		driver.close();
		System.out.println(driver.getWindowHandles().size());
		
	}
}
