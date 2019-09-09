package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BaseClass {
	//set the path of driver executable
	static{
System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	//Launch the browser
	public static WebDriver driver = new FirefoxDriver();
}
