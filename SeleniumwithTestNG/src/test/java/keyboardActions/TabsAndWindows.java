package keyboardActions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.orangehrm.com/");
		
		//introduced in selenium 4 
		//driver.switchTo().newWindow(WindowType.TAB);//opens new tab
		
		driver.switchTo().newWindow(WindowType.WINDOW);//opens new window 
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
	}

}
