package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedTextSelenium7 {
	public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();;
		 driver.get("https://www.google.in");
		WebElement gma= driver.findElement(By.linkText("Gmail"));
		gma.click();
		 
		 
	}

}
