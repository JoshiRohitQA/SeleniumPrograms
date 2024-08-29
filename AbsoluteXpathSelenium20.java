package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpathSelenium20 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/rohit.joshi/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		
		WebElement userNAme=driver.findElement(By.xpath("(/html/body/input)[1]"));
		userNAme.sendKeys("Rohit");
		
		WebElement boy=driver.findElement(By.xpath("(/html/body/form/input)[4]"));
		boy.click();
		
	}

}
