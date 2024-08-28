package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankLoginSelenium16 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://my.idfcfirstbank.com/login");
		driver.manage().window().maximize();
		
		WebElement userName= driver.findElement(By.name("userName"));
		userName.sendKeys("Rohit");
		
		WebElement submit= driver.findElement(By.tagName("button"));
		submit.click();
		
		
		
	}

}
