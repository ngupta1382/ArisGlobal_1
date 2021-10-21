package demo;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

	public static void main(String[] args) {

System.setProperty("webdriver.edge.driver","C:\\Users\\00005224\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Training\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.get ("https://www.google.com");
		String vTitle = driver.getTitle();
		
		//System.out.println()"URL is"+driver.getCurrent URL
		System.out.println("Title is "+vTitle);
		driver.close();
		

	}

}
