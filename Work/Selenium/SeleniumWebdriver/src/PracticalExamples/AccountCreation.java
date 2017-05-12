package PracticalExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountCreation {

	public static void main(String[] args) {

		// selenium code

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sowmy\\geckodriver.exe"); // for firefox
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Sowmy\\chromedriver.exe"); // for chrome
		// System.setProperty("webdriver.ie.driver","C:\\Users\\Sowmy\\IEDriverServer.exe"); // for IE
		WebDriver driver = new FirefoxDriver(); // Invoking FireFox browser
		// WebDriver driver = new ChromeDriver(); // Invoking Chrome browser
		// WebDriver driver = new InternetExplorerDriver(); // Invoking IE browser
		driver.get("https://www.facebook.com/");// pass the url to the driver
		driver.manage().window().maximize();// maximizes the window
		System.out.println(driver.getTitle()); // to know the title of the page
		System.out.println(driver.getPageSource()); // to know the page source
		System.out.println(driver.getCurrentUrl()); // to verify with the url
													// which we have mentioned
													// in line 15
		// time between one step to another

		
	//	driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.id("u_0_1")).sendKeys("Sruthi");
		driver.findElement(By.id("u_0_5")).sendKeys("sowmya2160@gmail.com");
		driver.findElement(By.id("u_0_8")).sendKeys("sowmya2160@gmail.com");
		driver.findElement(By.id("u_0_a")).sendKeys("Wrongpassword@14");
		driver.findElement(By.xpath(".//*[@id='u_0_3']")).sendKeys("Reddy");

		Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel1.selectByVisibleText("Feb");

		Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		sel2.selectByValue("28");

		Select sel3 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		sel3.selectByIndex(24);

		driver.findElement(By.id("u_0_h")).click();

		driver.findElement(By.name("websubmit")).click();

		Select drp = new Select(driver.findElement(By.xpath(".//*[@id='userNavigationLabel']]")));
		drp.selectByVisibleText("Log Out");           		
		
		driver.close();

	}

}
