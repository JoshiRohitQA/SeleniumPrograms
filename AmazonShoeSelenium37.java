package basic.programs;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AmazonShoeSelenium37 {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("shoes");
		
		Thread.sleep(2000);
		
		List<WebElement> shoe= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		
		System.out.println(shoe.size());
		
		shoe.get(4).click();
		
		System.out.println(driver.getTitle());
		
		
		
		TakesScreenshot ts =driver;
	File source=	ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\rohit.joshi\\Desktop\\New folder\\Java Diagrams\\amazonshoes.png");
	FileHandler.copy(source, destination);
	
		
	}

}
