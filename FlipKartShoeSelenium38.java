package basic.programs;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FlipKartShoeSelenium38 {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.sendKeys("shoes");
		
		Thread.sleep(2000);
		
		List<WebElement> shoeLis=driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li/div"));
		
		
		
		System.out.println(shoeLis.size());
		
		shoeLis.get(2).click();
		
		
		TakesScreenshot ts=driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\rohit.joshi\\Desktop\\New folder\\Java Diagrams\\flipkartshoes8.png");
		FileHandler.copy(source, destination);
		
		
	}

}
