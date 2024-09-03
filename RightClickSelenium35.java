package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickSelenium35 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement gmail = driver.findElement(By.xpath("(//a[.='Gmail'])[1]"));
		
		Actions a1 = new Actions(driver);
		a1.contextClick(gmail).perform();
		
		
	}

}
