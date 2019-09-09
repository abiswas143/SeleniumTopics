package testpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
public class FrameDemo  extends BaseClass{
	public static void main(String[] args) {
	driver.get("file:///C:/Users/Ajith/Music/sample%20webpages/Frame_Page2.html");
	//Enter admin in to T1 textbox
	driver.switchTo().frame(0); //using Index
	driver.findElement(By.id("t1")).sendKeys("admin");
	//switch back to the main page - isng defaultContent method
	//driver.switchTo().defaultContent();
	driver.switchTo().parentFrame();
	driver.findElement(By.id("t2")).sendKeys("manager");
	}
}
