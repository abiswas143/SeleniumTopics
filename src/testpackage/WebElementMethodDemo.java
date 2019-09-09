package testpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class WebElementMethodDemo extends BaseClass {
	public static void main(String[] args) {
		//enter the url
		driver.get("http://localhost:90/login.do");
		//get the address of ViewLIcence link
WebElement viewLicLinkObj = driver.findElement(By.id("licenseLink"));
	//verify whether this view licence is a link or not ?
	String actTN = viewLicLinkObj.getTagName();
	System.out.println(actTN);//"a"
	if (actTN.equals("a")) {
		System.out.println("YES, View licence is a LINK");
		viewLicLinkObj.click();
	} else {
		System.out.println("NO, View licence is NOT a LINK");
	}
	driver.close();
	}
}
