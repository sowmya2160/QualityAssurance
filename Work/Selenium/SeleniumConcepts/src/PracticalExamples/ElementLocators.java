package PracticalExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementLocators {

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\sowmy\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sowmy\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new ChromeDriver();

		driver.get("https://www.idealist.org/en/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign Up")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("form-input-first_name")).sendKeys("Sowmya");
		driver.findElement(By.name("last_name")).sendKeys("Reddy");
		driver.findElement(By.xpath(".//input[@type='email']")).sendKeys("sowmya1408@gmail.com");
		driver.findElement(By.id("form-input-password")).sendKeys("Saibersys1408");
		driver.findElement(By.className("btn btn-block btn-primary qa-signup-button")).click();
		
	}
}

