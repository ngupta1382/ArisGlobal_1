package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		
		//System.out.println("Helloworld");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005224\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get ("https://www.google.com");
		String vTitle = driver.getTitle();
		
		//System.out.println("TheURL is "+driver.get current url);
		System.out.println("Title is "+vTitle);
		driver.close();
		
		//Add Comment
		
	}
		
		
}
