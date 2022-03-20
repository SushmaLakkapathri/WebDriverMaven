package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		
		driver = new FirefoxDriver();
		
		
	}
	@Test
	public void doLogin() {
		
		driver.get("https://www.zoho.com/");
		driver.findElement(By.cssSelector(".zh-login")).click();
		driver.findElement(By.cssSelector("#login_id")).sendKeys("avisushu1116@gmail.com");
		driver.findElement(By.cssSelector("#nextbtn")).click();
		driver.findElement(By.cssSelector("#password")).sendKeys("$Miley16");
		driver.findElement(By.cssSelector("#nextbtn")).click();
	}
	@AfterSuite
	public void teardown() {
		driver.quit();
	}

}