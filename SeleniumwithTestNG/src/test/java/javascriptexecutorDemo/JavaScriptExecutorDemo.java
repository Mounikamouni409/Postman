package javascriptexecutorDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='name']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//JavascriptExecutor js = driver; // for assigning chromedriver directly 
		
		//passing text into inputbox- alternate of sendkeys
		js.executeScript("arguments[0].setAttribute('value','John')", firstname);
		
		WebElement radioButton = driver.findElement(By.xpath("//input[@id='male']"));
		//alternate of click()
		js.executeScript("arguments[0].click()", radioButton);

	}

}
