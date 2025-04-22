package keyboardActions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinkInNewTab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.nopcommerce.com/");
		driver.manage().window().maximize();
		
		Actions act =new Actions(driver);
		
		WebElement user= driver.findElement(By.xpath("//span[@class='user-actions-ico']"));
		WebElement register = driver.findElement(By.xpath("//span[normalize-space()='Register']"));
		
		//ctrl+ link--> opens in a new tab 
		act.moveToElement(user).keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).perform();
		
		List<String> ids = new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(ids.get(1));//switch to registration page
		
		driver.findElement(By.id("FirstName")).sendKeys("Mgshcfg");
		driver.switchTo().window(ids.get(0));
		
		WebElement product= driver.findElement(By.xpath("//span[normalize-space()='Product']"));
		WebElement storeDemo = driver.findElement(By.xpath("//span[normalize-space()='Store demo']"));
		
		act.moveToElement(product).click(storeDemo).perform();

	}

}
