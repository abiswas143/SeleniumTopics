package testpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class MouseHoverDemo extends BaseClass{
	public static void main(String[] args) {
		driver.get("http://istqb.in/");
		//Mouse hover on Foundation element
WebElement foundationObj = driver.findElement(By.xpath("(//a[text()='FOUNDATION'])[1]"));
	Actions action = new Actions(driver);
	action.moveToElement(foundationObj).perform();
	}
}
