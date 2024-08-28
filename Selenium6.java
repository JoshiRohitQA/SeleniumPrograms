package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium6 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registeration-form/");
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Rohit");
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Joshi");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("rohitjoshi4353@gmail.com");
		WebElement phoneNo = driver.findElement(By.id("phone"));
		phoneNo.sendKeys("9873733936");
		WebElement aadharNO = driver.findElement(By.id("aadhaar"));
		aadharNO.sendKeys("123456789011");
		WebElement panNO = driver.findElement(By.id("pan"));
		panNO.sendKeys("ABCDE1234A");
		WebElement termsCheck = driver.findElement(By.id("terms"));
		termsCheck.click();
		WebElement register = driver.findElement(By.name("Submit"));
		register.click();
		
		
		
		
		
	}

}
