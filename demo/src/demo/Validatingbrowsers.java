package demo;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Validatingbrowsers {

	public static void main(String[] args) {

		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter Browser NAme");
		String VBrowser = myobj.nextLine();
		
		if (VBrowser.contains("Edge"))
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\00005224\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Training\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.get ("https://www.google.com");
		String vTitle = driver.getTitle();
		
		//System.out.println()"URL is"+driver.getCurrent URL
		System.out.println("Title is "+vTitle);
		driver.close();
		}
		
		else if (VBrowser.contains("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\00005224\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Training\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get ("https://www.google.com");
			String vTitle = driver.getTitle();
			
			//System.out.println()"URL is"+driver.getCurrent URL
			System.out.println("Title is "+vTitle);
			driver.close();
			
		}
		
		else
		{
			System.out.println("invalid Browser");
			
	}

		}
	}



