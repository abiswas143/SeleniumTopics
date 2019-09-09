package testpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
public class ValidateErrorMsgDemo extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		driver.get("http://localhost:90/login.do");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//Thread.sleep(3000);
		String xp = "//span[contains(text(),'invalid')]";
		//verify error msg is displayed
		WebElement errMsgObj = driver.findElement(By.xpath(xp));
		boolean displayed = errMsgObj.isDisplayed();
		if (displayed) {
			System.out.println("Yes, error msg is displayed");
			//Verify the error msg text is correct
			String actErrMsgText = errMsgObj.getText();
	if (actErrMsgText.equals("Username or Password is invalid. Please "
					+ "try again.")) {
				System.out.println("Valid err msg text is displayed..");
				//Verify that error msg is in RED color
				String initialColorCode = errMsgObj.getCssValue("color");
	System.out.println("Initial Color Code-->"+initialColorCode);//rgb
	String colorAsHex = Color.fromString(initialColorCode).asHex();
	System.out.println("final Color Code-->"+colorAsHex);//#ce0100
				if (colorAsHex.equals("#ce0100")) {
					System.out.println("Valid color : RED");
				} else {
					System.out.println("Invalid color");
				}
			} else {
				System.out.println("InValid err msg is displayed..");
			}
		} else {
			System.out.println("error msg NOT displayed");
		}
		driver.close();

	}
}
