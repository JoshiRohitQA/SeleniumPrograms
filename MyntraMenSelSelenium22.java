package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraMenSelSelenium22 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		WebElement men= driver.findElement(By.xpath("//a[.='Men']"));
		men.click();
	}

}
