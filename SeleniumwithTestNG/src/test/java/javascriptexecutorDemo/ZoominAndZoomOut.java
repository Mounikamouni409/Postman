package javascriptexecutorDemo;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoominAndZoomOut {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		//Thread.sleep(5000);
		//driver.manage().window().minimize();
		//Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//set the zoom level on page
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='60%'");
		Thread.sleep(5000);
		
		js.executeScript("document.body.style.zoom='30%'");
		Thread.sleep(5000);
		
		js.executeScript("document.body.style.zoom='80%'");

	}

}
