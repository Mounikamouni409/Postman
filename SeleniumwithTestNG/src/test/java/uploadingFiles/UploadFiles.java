package uploadingFiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();

		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\MADHU KISHORE PATNAM\\Testing\\Text1.txt");

		
		String text = driver.findElement(By.xpath("//ul[@id='fileList']/li")).getText();
		System.out.println(text);
		
		if(text.equals("Text1.txt")) {
			System.out.println("File uploaded successfully");
		}
		else {
			System.out.println("File not uploaded");
		}
		*/
		
		//Multiple file upload
		String file1 ="C:\\Users\\MADHU KISHORE PATNAM\\Testing\\Text1.txt";
		String file2 ="C:\\Users\\MADHU KISHORE PATNAM\\Testing\\Text2.txt";
		
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int noofFiles = driver.findElements(By.xpath("//ul[@id='fileList']/li")).size();
		if(noofFiles==2) {
			System.out.println("files are uploaded correctly....");
		}
		else {
			System.out.println("Something went wrong");
		}
		
		
	}

}
