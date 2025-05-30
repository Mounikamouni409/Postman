package testngExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/*
1) Open the application
2)test logo presence
3)login
4)close
*/

public class OrangeHRM {

	public WebDriver driver;
	
	@Test(priority=1)
	public void openApp() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
	}
	@Test(priority=2)
	public void testLogo() {
		
		boolean status =driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Logo displayed..."+status);
	}
	@Test(priority=3)
	public void testLogin() {
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}
	
	@Test(priority=4)
	public void closeApp() {
		driver.quit();
	}
}
