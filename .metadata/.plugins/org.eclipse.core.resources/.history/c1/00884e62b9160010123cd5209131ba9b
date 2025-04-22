package chromeoptionsActions;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BlockingAds {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		File file = new File("C:\\Users\\MADHU KISHORE PATNAM\\OneDrive\\Documents\\Automation\\CRX\\Easy-Ad-Blocker.crx");
		options.addExtensions(file);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://text-compare.com/");
		driver.manage().window().maximize();

	}

}
