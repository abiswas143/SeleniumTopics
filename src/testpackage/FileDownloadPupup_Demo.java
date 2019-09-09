package testpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
public class FileDownloadPupup_Demo{
	public static void main(String[] args) {
		FirefoxProfile profile = new FirefoxProfile();
		//URL - http://kb.mozillazine.org/About:config_entries#Browser
		String key="browser.helperApps.neverAsk.saveToDisk";
		//URL - https://www.freeformatter.com/mime-types-list.html
		String value="application/zip";
		profile.setPreference(key, value);
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
		WebDriver driver = new FirefoxDriver(option);
		driver.get("https://www.seleniumhq.org/download/");
		//click on Download link against JAVA
String xpathExpression = "//td[text()='Java']/following-sibling::td/a[text()='Download']";
		driver.findElement(By.xpath(xpathExpression)).click();
	}
}
