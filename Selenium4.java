package basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement signin =driver.findElement(By.id("ap_email"));
		signin.sendKeys("test123@gmail.com");
		
		WebElement continuebtn =driver.findElement(By.id("continue"));
		continuebtn.click();
		
		WebElement pass=driver.findElement(By.id("ap_password"));
		pass.sendKeys("12323");
		
		WebElement sigin = driver.findElement(By.id("signInSubmit"));
		sigin.click();
		
		Thread.sleep(1000);
		
		driver.close();
	}

}
