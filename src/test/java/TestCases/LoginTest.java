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
		//Using EGIT plugin to the project
		//I have to add the Extent Reports as well 
		driver.get("https://www.zoho.com/");
		driver.findElement(By.cssSelector(".zh-login")).click();
		driver.findElement(By.cssSelector("#login_id")).sendKeys("avisushu1116@gmail.com");
		driver.findElement(By.cssSelector("#nextbtn")).click();
		driver.findElement(By.cssSelector("#password")).sendKeys("$Miley16");
		driver.findElement(By.cssSelector("#nextbtn")).click();
		driver.findElement(By.cssSelector("._logo-crm._logo-x96.zod-app-logo")).click();
	}
	@AfterSuite
	public void teardown() {
		driver.quit();
	}

}
