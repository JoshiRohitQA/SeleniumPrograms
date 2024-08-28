package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium13 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.in");
		WebElement e1 = driver.findElement(By.name("q"));
		
		if(e1.isDisplayed() && e1.isEnabled()) {
			e1.sendKeys("India" + Keys.ENTER);
		}
		
	}

}
