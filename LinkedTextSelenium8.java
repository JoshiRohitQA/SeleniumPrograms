package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedTextSelenium8 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();;
		 driver.get("https://www.amazon.in");
		WebElement bestSe= driver.findElement(By.linkText("Best Sellers"));
		bestSe.click();
	}

}
