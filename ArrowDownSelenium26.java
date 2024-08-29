package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrowDownSelenium26 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement category = driver.findElement(By.xpath("//select[@name='url']"));
		
		for(int i=0;i<3;i++) {
			category.sendKeys(Keys.ARROW_DOWN);
		}
		
		category.sendKeys(Keys.ENTER);
	}

}
