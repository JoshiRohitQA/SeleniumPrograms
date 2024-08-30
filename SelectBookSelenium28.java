package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBookSelenium28 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement search =driver.findElement(By.xpath("//select[@name='url']"));
		
		Select s1 = new Select(search);
		//s1.selectByValue("search-alias=stripbooks");
		//s1.selectByVisibleText("Books");
		s1.selectByIndex(12);
		
		
	}

}
