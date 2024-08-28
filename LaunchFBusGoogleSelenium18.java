package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFBusGoogleSelenium18 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.in");
		driver.manage().window().maximize();
		
		WebElement searchBox =driver.findElement(By.name("q"));
		searchBox.sendKeys("Facebook" + Keys.ENTER);
		
		
		WebElement fblogin =driver.findElement(By.linkText("Log in"));
		fblogin.click();
	}

}
