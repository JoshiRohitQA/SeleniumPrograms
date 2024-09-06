package basic.programs;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinksSelenium41 {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		
		for(int i=0;i<li.size();i++) {
			WebElement e1=li.get(i);
			String url=e1.getAttribute("href");
			System.out.println(url);
			System.out.println(e1.getText());
			verifyURL(url);
		}
		
	
		
	}
	
	static void verifyURL(String url) throws IOException {
		try {
		
		URL u1= new URL(url);
		
		HttpURLConnection u2 =(HttpURLConnection)u1.openConnection();
		
		
		if(u2.getResponseCode()==200) {
			System.out.println("valid link"+" "+u2.getResponseCode()+" "+u2.getResponseMessage());
		}
		else {
			System.out.println("Invalid link"+" "+u2.getResponseCode()+" "+u2.getResponseMessage());
		}
		}
		
		catch(java.net.MalformedURLException e1) {
			System.out.println("handled it");
		}
		catch(java.net.UnknownHostException e2) {
			System.out.println("handeled second exception");
		}
		
	}


}
