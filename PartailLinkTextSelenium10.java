package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartailLinkTextSelenium10 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		WebElement cont=driver.findElement(By.partialLinkText("CONTINUE TO"));
		cont.click();
		
		WebElement userN=driver.findElement(By.id("username"));
		userN.sendKeys("Rohit");
		
		WebElement pass=driver.findElement(By.id("label2"));
		pass.sendKeys("1232Ro");
		
		WebElement capch=driver.findElement(By.id("loginCaptchaValue"));
		capch.sendKeys("dgdgdg");
		
		
		
	}

}
