package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration1DropSelenium32 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		
		Select s1 = new Select(skills);
		s1.selectByValue("select1");
		
		
        WebElement Country = driver.findElement(By.xpath("//select[@id='Country']"));
		
		Select s2 = new Select(Country);
		s2.selectByValue("India");
		
		
		 WebElement Relegion = driver.findElement(By.xpath("//select[@id='Relegion']"));
			
			Select s3 = new Select(Relegion);
			s3.selectByValue("Hindu");
		
		
		
		
	}

}
