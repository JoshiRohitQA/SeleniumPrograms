package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTextXpathSelenium24 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement mobile = driver.findElement(By.xpath("(//a[.='Mobiles'])[1]"));
		mobile.click();
	}

}
