package PracticalExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountLogin {
	
	
	public static void main(String[] args) throws InterruptedException{
		
 //System.setProperty("webdriver.gecko.driver","C:\\users\\Sowmy\\geckodriver.exe");
 System.setProperty("webdriver.chrome.driver","C:\\users\\Sowmy\\chromedriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.navigate().back();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("sowmya2160@gmail.com");
		driver.findElement(By.xpath(".//input[@type='password']")).sendKeys("Wrongpassword@14");
		driver.findElement(By.xpath(".//input[@value='Log In']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#userNavigationLabel")).click();
		//driver.findElement(By.)
		
	
		driver.close();	
		
	
		
	}

}
