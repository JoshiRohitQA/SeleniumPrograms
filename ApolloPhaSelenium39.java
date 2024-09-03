package basic.programs;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ApolloPhaSelenium39 {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.apollopharmacy.in/");
		driver.manage().window().maximize();
		
		WebElement searchinitial=driver.findElement(By.xpath("//div[@class='SearchPlaceholder_searchRoot__LWDXI icon-searchIcon SearchPlaceholder_icon___bJlq']"));
		searchinitial.click();
		WebElement searchFinal=driver.findElement(By.xpath("//input[@id='searchProduct']"));
		Thread.sleep(2000);
		searchFinal.sendKeys("PCM");
		
		Thread.sleep(2000);
		
		List<WebElement> pro=driver.findElements(By.xpath("//div[@class='MedicineAutoSearch_searchList___m_g7 null']/ul/li"));
		System.out.println(pro.size());
		Thread.sleep(3000);
		pro.get(2).click();
		
		
		
		TakesScreenshot ts=driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\rohit.joshi\\Desktop\\New folder\\Java Diagrams\\Apolo.png");
		FileHandler.copy(source, destination);
		
		
	}

}
