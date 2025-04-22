package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement source= driver.findElement(By.id("fourth"));
		WebElement target = driver.findElement(By.xpath("(//div[@class='shoppingCart']/div[@class='ui-widget-content'])[2]"));
		
		//act.dragAndDrop(source, target).build().perform();
		act.dragAndDropBy(source, 107, 40).perform();
		

	}

}
