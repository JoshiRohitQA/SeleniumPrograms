package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOverSelenium34 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.grotechminds.com/automate-me/");
		driver.manage().window().maximize();
		
		WebElement regist = driver.findElement(By.xpath("//div[@data-id='857ca79']"));
		
		WebElement flight = driver.findElement(By.xpath("//div[@data-id='e3e596b']"));
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(regist).perform();
		Thread.sleep(2000);
		a1.moveToElement(flight).perform();
	}

}
