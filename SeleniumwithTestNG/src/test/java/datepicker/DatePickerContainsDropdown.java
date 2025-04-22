package datepicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerContainsDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// input

		String requriedyear = "2021";
		String requiredMonth = "Jan";
		String requiredDay = "4";

		// click on date input box
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();

		// Select Year
		WebElement yearDropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectYear = new Select(yearDropdown);
		selectYear.selectByVisibleText(requriedyear);

		// select Month
		WebElement monthDropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select selectMonth = new Select(monthDropdown);
		selectMonth.selectByVisibleText(requiredMonth);

		
		// Select the date
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));

		for (WebElement date : allDates) {
			if (date.getText().equals(requiredDay)) {
				date.click();
				break;
			}
		}
	}

}
