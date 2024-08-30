package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration1DropSelenium33 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		
		WebElement FirsNam= driver.findElement(By.xpath("//input[@id='firstName']"));
		FirsNam.sendKeys("Rohit");
		
		WebElement LasNam= driver.findElement(By.xpath("//input[@id='lastName']"));
		LasNam.sendKeys("Joshi");
		
		WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("rohitjoshi4353@gmail.com");
		
		WebElement phone= driver.findElement(By.xpath("//input[@id='phone']"));
		phone.sendKeys("9873733937");
		
		WebElement gender= driver.findElement(By.xpath("//select[@id='gender']"));
		
		Select s1 = new Select(gender);
		s1.selectByValue("male");
		
		WebElement state= driver.findElement(By.xpath("//select[@id='state']"));
		
		Select s2 = new Select(state);
		s2.selectByValue("delhi");
		
		WebElement adhar= driver.findElement(By.xpath("//input[@id='aadhaar']"));
		adhar.sendKeys("123456789012");
		
		WebElement pan= driver.findElement(By.xpath("//input[@id='pan']"));
		pan.sendKeys("ABCDE1234C");
		
		WebElement terms= driver.findElement(By.xpath("//input[@id='terms']"));
		terms.click();
		
		WebElement register= driver.findElement(By.xpath("//button[@name='Submit']"));
		register.click();
		
		
		
		
		
		
		
		
		
	}

}
