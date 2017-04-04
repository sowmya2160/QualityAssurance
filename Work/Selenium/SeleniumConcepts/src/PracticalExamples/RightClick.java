package PracticalExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "C:\\sowmya\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\sowmya\\chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//ul[@class='Pos(r) Miw(1000px) Pstart(9px) Lh(1.7) Reader-open_Op(0) mini-header_Op(0)']/li[2]"));
        action.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
        action.perform();
	
	}

}
