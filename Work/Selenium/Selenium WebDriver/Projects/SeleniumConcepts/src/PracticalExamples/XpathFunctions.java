package PracticalExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathFunctions {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sowmy\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");// pass the url to the driver
		driver.manage().window().maximize();// maximizes the window
		System.out.println(driver.getTitle()); // to know the title of the page
		System.out.println(driver.getPageSource()); // to know the page source
		System.out.println(driver.getCurrentUrl()); // to verify with the url
		driver.findElement(By.id("u_0_1")).sendKeys("Sruthi");
		driver.findElement(By.id("u_0_3")).sendKeys("Reddy");
		driver.findElement(By.id("u_0_6")).sendKeys("sowmya2160@gmail.com");
		driver.findElement(By.id("u_0_9")).sendKeys("sowmya2160@gmail.com");
		driver.findElement(By.id("u_0_d")).sendKeys("Wrongpassword@14");

		Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel1.selectByVisibleText("Feb");

		Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		sel2.selectByValue("28");

		Select sel3 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		sel3.selectByIndex(24);
		driver.findElement(By.id("u_0_g")).click();
		driver.findElement(By.linkText("Create Account")).click();
		Select drp = new Select(driver.findElement(By.xpath(".//*[@id='userNavigationLabel']]")));
		drp.selectByVisibleText("Log Out");

		driver.close();
	}

}
