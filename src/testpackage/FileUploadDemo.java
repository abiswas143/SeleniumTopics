package testpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
public class FileUploadDemo extends BaseClass{
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com");
		
WebElement uploadCV = driver.findElement(By.id("input_resumeParser"));

uploadCV.sendKeys("C:\\Users\\Ajith\\Desktop\\Selenium WebDriver Course Content.docx");



	}
}
