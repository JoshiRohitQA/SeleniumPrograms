package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextSelenium19 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.firstcry.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement boyFshion = driver.findElement(By.linkText("BOY FASHION"));
		boyFshion.click();
	}

}
