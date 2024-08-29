package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathGoogleSelenium23 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//textarea[@name='q']"));
		search.sendKeys("India");
		Thread.sleep(2000);
		for(int i=0;i<3;i++) {
			search.sendKeys(Keys.ARROW_DOWN);
		}
		search.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
	}

}
