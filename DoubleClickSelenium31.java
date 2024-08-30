package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickSelenium31 {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	WebElement gmai = driver.findElement(By.xpath("//a[.='Gmail']"));
	
	Actions a1 = new Actions(driver);
	a1.doubleClick(gmai).perform();
	
}
}
