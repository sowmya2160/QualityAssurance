package PracticalExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SouthwestAirlines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowmy\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.southwest.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//input[@id='trip-type-round-trip']")).click();
		driver.findElement(By.xpath(".//input[@id='air-city-departure']")).sendKeys("MCI");
	    driver.findElement(By.xpath(".//input[@id='air-city-arrival']")).sendKeys("dallas");
	    driver.findElement(By.id("air-date-departure")).click();
	    driver.findElement(By.xpath(".//*[@data-date='1/15/2017']")).click();
	    driver.findElement(By.cssSelector("#air-date-return")).click();
	    driver.findElement(By.cssSelector("#calendar-february-16")).click();
	    driver.findElement(By.id("price-type-points")).click();
	    driver.findElement(By.name("adultPassengerCount")).click();
	    
	    int i=0;
	    while(i<4){
	    	driver.findElement(By.xpath(".//*[@id='jb-number-selector-more']")).click();
	    	i++;
	    }
	    
	    driver.findElement(By.cssSelector("#jb-booking-form-submit-button")).click();
	   
	    
	    
	    
	  
		
		
		
		
	

	}

}
