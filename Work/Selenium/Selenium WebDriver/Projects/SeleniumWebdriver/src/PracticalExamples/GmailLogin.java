package PracticalExamples;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.gecko.driver","C:\\users\\Sowmy\\geckodriver.exe");
		 System.setProperty("webdriver.chrome.driver","C:\\users\\Sowmy\\chromedriver.exe");
	//	WebDriver driver = new FirefoxDriver();
	WebDriver driver = new ChromeDriver();
     	driver.get("https://accounts.google.com/ServiceLogin?sacu=1&continue=https%3A%2F%2Fwww.google.com%2F&hl=en#identifier");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#Email")).sendKeys("sowmya2160@gmail.com");
		driver.findElement(By.cssSelector("#next")).click();
        Thread.sleep(5000);
		driver.findElement(By.cssSelector("#Passwd")).sendKeys("Saibersys2160");
		driver.findElement(By.cssSelector("#signIn")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".gb_9a.gbii")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Privacy")).click();
		System.out.println(driver.getTitle());
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".gb_9a.gbii")).click();
		driver.findElement(By.id("gb_71")).click();
		driver.close();
		driver.quit();
		
		
		
		
		
	}

}
