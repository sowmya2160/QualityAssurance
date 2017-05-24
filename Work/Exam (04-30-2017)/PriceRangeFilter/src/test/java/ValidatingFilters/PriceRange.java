package ValidatingFilters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PriceRange {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\sowmya\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		try {
		driver.get("https://disneyworld.disney.go.com/resorts/");
		driver.manage().window().maximize();
		driver.findElement(By.id("priceRangeResorts")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("$-resorts")).click();
		System.out.println(driver.findElement(By.id("activityFilters")).getText());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("$$-resorts")).click();
		System.out.println(driver.findElement(By.id("activityFilters")).getText());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("$$$-resorts")).click();
		System.out.println(driver.findElement(By.id("activityFilters")).getText());
		}
		catch(Exception ex){
			System.out.println("Exception " + ex.getMessage());
		}
		
		
		
	}
}