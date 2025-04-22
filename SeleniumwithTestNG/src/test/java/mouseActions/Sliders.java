package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {

	 public static void main(String[] args) {
		 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.get("https://www.globalsqa.com/demoSite/practice/slider/range.html");
		 
		 driver.manage().window().maximize();
		 
		 Actions act = new Actions(driver);
		 
		 //Min Slider
		 WebElement min_slider= driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')][1]"));
		 System.out.println(min_slider.getLocation());// (226, 47)
		 
		 //increasing the value of min slider x-axis
		 act.dragAndDropBy(min_slider, 300, 47).perform();/* here we are performing drag and drop w.r.t 
		 													x-axis means horizontally no need to change y-axis*/
		 System.out.println(min_slider.getLocation());
		 
		 //MaxSlider
		 WebElement max_slider=driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')][2]"));
		 System.out.println(max_slider.getLocation());
		 
		 // decreasing the value of max slider  x-axis
		 act.dragAndDropBy(max_slider, -226, 47).perform();
		 
		 System.out.println(max_slider.getLocation());
		 
		 WebElement price = driver.findElement(By.xpath("//input[@id='amount']"));
		 String amount = price.getText();
		 System.out.println(amount);
		
	}
}
