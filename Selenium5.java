package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium5 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("rohitjoshi4353@gmail.com");
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("12342");
		WebElement signin = driver.findElement(By.name("login"));
		signin.click();
	}

}
