package testpackage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
public class AlertDemo extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert(); 
		//validate the alert mesage is correct or not ?
		String actualAlertMsg = alert.getText();
		System.out.println("Actual alert text is :--> \n" +actualAlertMsg);
String expectedAlertMsg ="Are you sure you want to give us the deed to your house?";
		if (actualAlertMsg.equals(expectedAlertMsg)) {
			System.out.println("Valid alert text is displayed");
		} else {
			System.out.println("Valid alert text is displayed");
		}
		//click on OK button on Alert popup.
		alert.dismiss();
		//alert.accept();//NoAlertPresentException
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		driver.close();
	}
}
