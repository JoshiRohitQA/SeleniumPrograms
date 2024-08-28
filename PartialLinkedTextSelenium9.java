package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkedTextSelenium9 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();;
		 driver.get("https://www.amazon.in");
		WebElement TodayDea= driver.findElement(By.partialLinkText("Today's De"));
		TodayDea.click();
	}

}
