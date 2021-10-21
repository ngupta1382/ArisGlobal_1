package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Query {

			public static void main(String[] args) throws InterruptedException 
			{
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\00005224\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Training\\chromedriver.exe");
			     WebDriver driver = new ChromeDriver();
				driver.get("https://jqueryui.com/droppable/");
				System.out.println("title is : "+driver.getTitle());
				
				String vText=driver.findElement(By.className("entry-title")).getText();                  
				System.out.println("Main Page Text : "+vText);
				
				
				int vFrame=driver.findElements(By.tagName("iframe")).size();
				System.out.println(vFrame);
				
				driver.switchTo().frame(0);
				driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
				
				vText=driver.findElement(By.id("draggable")).getText();
				System.out.println(vText);
				
				WebElement Drag=driver.findElement(By.id("draggable"));
				//WebElement Drop=driver.findElement(By.id("droppable"));
				
				//Actions act=new Actions(driver);
				//act.dragAndDrop(Drag, Drop).build().perform();
				
				Thread.sleep(4000);
				
				driver.switchTo().defaultContent();
				
				
				//vText=driver.findElement(By.className("entry-title")).getText();
				//System.out.println("Main Page Text : "+vText);
				
				driver.close();
				
				}


			




	}


