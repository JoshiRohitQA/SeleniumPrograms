package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProCartSelenium25 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement searchBox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("Iphone 15 pro max" + Keys.ENTER);
		
		Thread.sleep(2000);
		
		WebElement cart = driver.findElement(By.xpath("//button[@id='a-autoid-1-announce']"));
		cart.click();
		
	}

}
