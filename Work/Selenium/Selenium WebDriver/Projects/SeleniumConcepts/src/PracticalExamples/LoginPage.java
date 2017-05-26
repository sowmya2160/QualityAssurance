package PracticalExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sowmy\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.navigate().back();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("sowmya2160@gmail.com");
		driver.findElement(By.xpath(".//input[@type='password']")).sendKeys("Wrongpassword@14");
		driver.findElement(By.xpath(".//input[@value='Log In']")).click();
		driver.findElement(By.cssSelector("#userNavigationLabel")).click();
		driver.close();	
		

	}

}
