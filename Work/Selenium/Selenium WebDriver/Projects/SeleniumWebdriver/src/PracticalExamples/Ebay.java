package PracticalExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ebay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "c:\\Users\\Sowmy\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("http://www.ebay.com/");
driver.manage().window().maximize();
driver.findElement(By.id("gh-btn")).click();
Thread.sleep(5000);
driver.findElement(By.linkText("Art from Dealers & Resellers")).click();
Thread.sleep(5000);
driver.findElement(By.linkText("Paintings")).click();
Thread.sleep(5000);
driver.findElement(By.linkText("Landscape")).click();
Thread.sleep(5000);
driver.findElement(By.linkText("Watercolor")).click();
Thread.sleep(5000);
driver.findElement(By.xpath(".//input[@data-value='2000-Now']")).click();
Thread.sleep(5000);
driver.findElement(By.id("e1-37")).click();
Thread.sleep(5000);
driver.findElement(By.xpath(".//*[@title='Click this link to access 100% ORIGINAL ASIAN ART CHINESE WATERCOLOR PAINTING-Fengshui Landscape&Mountains']")).click();
Thread.sleep(5000);
driver.findElement(By.linkText("Add to cart")).click();
Thread.sleep(5000);
driver.findElement(By.linkText("Back to item page")).click();
Thread.sleep(5000);
driver.findElement(By.id("smtBackToAnchor")).click();
Thread.sleep(5000);
driver.findElement(By.xpath(".//*[@title='Click this link to access Fengshui Koi fishes-HANDPAINTED ORIGINAL ART CHINESE FAMOUS WATERCOLOR PAINTING']")).click();
Thread.sleep(5000);
driver.findElement(By.id("isCartBtn_btn")).click();
Thread.sleep(5000);
driver.findElement(By.linkText("Proceed to checkout")).click();
driver.quit();






	}

}
