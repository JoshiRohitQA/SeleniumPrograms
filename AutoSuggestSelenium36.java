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

public class AutoSuggestSelenium36 {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//textarea[@name='q']"));
		
		search.sendKeys("bangalore");
		
		Thread.sleep(3000);
		
		List<WebElement> li= driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]/ul/li"));
		
		
		System.out.println(li.size());
		
		li.get(2).click();
		
		
		   TakesScreenshot t1 =driver;
		File source=   t1.getScreenshotAs(OutputType.FILE);
		File  destination = new File("C:\\Users\\rohit.joshi\\Desktop\\New folder\\Java Diagrams\\screnshot1.png");
		FileHandler.copy(source, destination);
		 
		
		
		
		
	}

}
