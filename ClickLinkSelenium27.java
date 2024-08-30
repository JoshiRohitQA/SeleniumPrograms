package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickLinkSelenium27 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/rohit.joshi/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		
		WebElement link = driver.findElement(By.tagName("a"));
		link.click();
	}

}
