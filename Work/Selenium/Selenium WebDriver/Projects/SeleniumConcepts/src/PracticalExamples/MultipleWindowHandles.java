package PracticalExamples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowHandles {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sowmy\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("#terms-link")).click();
		System.out.println(driver.getTitle());
		
	    Set<String>ids=driver.getWindowHandles();
	    Iterator<String> it=ids.iterator();
	    String parentid = it.next();
	    String childid = it.next();
	    driver.switchTo().window(childid);
		
	}

}
