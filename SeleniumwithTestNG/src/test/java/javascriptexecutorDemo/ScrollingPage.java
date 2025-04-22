package javascriptexecutorDemo;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//1) scroll down the page by providing pixel number
		
		/*js.executeScript("window.scrollBy(0,400)");
		System.out.println(js.executeScript("return window.pageYOffset;"));// for vertical scroll bar*/
		//System.out.println(js.executeScript("return window.pagexOffset;")); for horizontal scroll bar
		
		
		//2)scroll the page till element is visible
		
		/*WebElement ele = driver.findElement(By.xpath("//h2[normalize-space()='Mouse Hover']"));
		js.executeScript("arguments[0].scrollIntoView();",ele);
		System.out.println(js.executeScript("return window.pageYOffset;"));*/
		
		//3)scroll the page till the end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//js.executeScript("window.scrollBy(0,document.body.scrollWidth)"); for horizontal scroll bar
		
		Thread.sleep(5000);
		//4) scroll the page to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		
		
		
		

	}

}
