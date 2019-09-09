package testpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LocatorsDemo {
	public static void main(String[] args) {
		//set the path of geckodriver.exe
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		//Launch the firefox browser
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		//click on the Download link against java languague
String xp="//td[text()='Java']/following-sibling::td/a[text()='Download']";
driver.findElement(By.xpath(xp)).click();
	}
}
