package datepicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//Method 1: Handle using sendkeys
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("02/02/2025");//MM/DD/YYYY
		
		//Method 2: Using Date Picker
		
		//1.Click on date input box
		
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();//opens the date picker
		
		//expected data
		
		String year = "2026";
		String month = "August";
		String day = "9";
		
		
		//Select month & year
		
		while(true) {
			
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//actual month
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();// actual year
			
			if(currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//Next Button
			
			
			//for previous we have to click on previous button rest all same
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//previous button
			
		}
		//Select the date
		List<WebElement> allDates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		
		for(WebElement date: allDates) {
			if(date.getText().equals(day)) {
				date.click();
				break;
			}
		}
		driver.close();
	}

}
