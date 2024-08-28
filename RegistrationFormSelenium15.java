package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationFormSelenium15 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.id("fname"));
		firstName.sendKeys("Rohit");
		
		WebElement lastName = driver.findElement(By.id("lname"));
		lastName.sendKeys("Joshi");
		
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("rohitjoshi4353@gmail.com");
		

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("1234678Rj");
		
		WebElement gender = driver.findElement(By.id("male"));
		if( gender.isEnabled() && gender.isSelected()) {
			System.out.println("Already gender selected");
		}
		else {
			System.out.println("Select the gender");
			gender.click();
		}
		
		WebElement Present_Address = driver.findElement(By.id("Present-Address"));
		Present_Address.sendKeys("Delhi");
		
		WebElement Permanent_Address = driver.findElement(By.id("Permanent-Address"));
		Permanent_Address.sendKeys("Delhi");
		
		WebElement Pincode = driver.findElement(By.id("Pincode"));
		Pincode.sendKeys("110054");
		
		WebElement relocate = driver.findElement(By.id("relocate"));
		if( relocate.isEnabled() && relocate.isSelected()) {
			System.out.println("Already relocate selected");
		}
		else {
			System.out.println("Select the relocate");
			relocate.click();
		}
		
		WebElement submit = driver.findElement(By.name("Submit"));
		submit.click();
		
		
		
		
		
	
	
		
		
	}

}
