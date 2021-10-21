package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Oct20 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005224\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Training\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
		
		driver.get ("https://www.cleartrip.com");
		System.out.println("Title "+driver.getTitle());
		Thread.sleep(5000);
		
		Select Dropdown= new Select(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[4]/div/div[1]/select")));
		Thread.sleep(2000);
	
		Dropdown.selectByIndex(3);
		Thread.sleep(2000);
		
		//Dropdown.selectByVisibleText(7);
		Thread.sleep(2000);
		
		
		

	
		
	
		driver.close();

	}

}
