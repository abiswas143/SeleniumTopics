package testngggggggggggggggggpackageeeeeee;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testpackage.BaseClass;
public class CrossBrowserCompatiblityDemo {
	WebDriver driver;
	static{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
	}
	@Parameters("browser")
	@Test
	public void runInMultipleBrowsers(String browser) throws InterruptedException{
		System.out.println(browser);
		if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if(browser.equals("chrome")){
			driver = new ChromeDriver();
		} else{
			driver = new InternetExplorerDriver();
		}
		driver.get("http://localhost:90/login.do");
		WebElement unTB = driver.findElement(By.id("username"));
		for (int i = 1; i <= 1; i++) {
			unTB.sendKeys("admin --> "+i);
			Thread.sleep(2000);
			unTB.clear();
		}
		driver.close();
	}
}
