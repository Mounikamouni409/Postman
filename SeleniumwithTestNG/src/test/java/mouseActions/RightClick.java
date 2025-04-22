package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		
		
		WebElement rightClick= driver.findElement(By.xpath("//span[normalize-space()='right click me']"));
		
		Actions action = new Actions(driver);
		
		//right or context click
		action.contextClick(rightClick).build().perform();
		
		WebElement edit = driver.findElement(By.xpath("//span[normalize-space()='Edit']"));
		edit.click();
		
		// navigate to alert
		driver.switchTo().alert().accept();

	}

}
