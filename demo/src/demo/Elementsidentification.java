package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementsidentification {

public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\00005224\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Training\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
	
	driver.get ("https://www.LinkedIN.com");
	System.out.println("Title "+driver.getTitle());
	
	driver.findElement(By.className("nav__button-secondary")).click();
	
	driver.findElement(By.id("username")).sendKeys("Testing");
	
	driver.findElement(By.name("session_password")).sendKeys("12345");
	
	//1.driver.findElement(By.xpath("//button[@aria-label='Sign in']")).click();
	//2.driver.findElement(By.xpath("//*[@aria-label='Sign in']")).click();
	//3.driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();
	driver.findElement(By.xpath("//button[@type='submit' and @aria-label='Sign in']")).click();
	  //5.driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	
	
	//String vError=driver.findElement(By.id("error-for-username")).getText();
	//System.out.println("error message is "+vError);
	
	//driver.findElement(By.partialLinkText("forgot")).click();
	//System.out.println("Title "+driver.getTitle());
	
	//driver.findElement(By.linkText("join_now\"")).click();
	//System.out.println("Title "+driver.getTitle());
	
	//int vSize=driver.findElements(By.tagName("a")).size();
	//System.out.println("Title "+driver.getTitle());
	
	
	
	Thread.sleep(5000);
	
	driver.close();
	
		}

}
