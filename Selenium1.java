package basic.programs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.in");
		Thread.sleep(2000);
		System.out.println(driver.getWindowHandle());
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
	}

}
