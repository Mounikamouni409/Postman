package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		
		WebElement doubleElement = driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
		
		Actions action = new Actions(driver);
		//double click
		action.doubleClick(doubleElement).perform();
		
		
		String alertMsg= driver.switchTo().alert().getText();
		System.out.println(alertMsg);
		driver.switchTo().alert().accept();
	}

}
