package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubesigninSelenium17 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.in");
		driver.manage().window().maximize();
		WebElement sigin = driver.findElement(By.xpath("//a[@aria-label='Sign in']"));
		sigin.click();
	}

}
