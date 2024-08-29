package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathSelenium21 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("(//input)[5]"));
		if(search.isEnabled() && search.isDisplayed()) {
		search.sendKeys("shoe"+Keys.ENTER);
		}
	}

}
