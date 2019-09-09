package testpackage;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class WindowPopupDemo_UsingAutoIT extends BaseClass{
	public static void main(String[] args) {
		driver.get("http://localhost:90/login.do");
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_P);
			r.keyRelease(KeyEvent.VK_P);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Runtime.getRuntime().exec("./autoit/printpopup.exe");
		} catch (Exception e) {
		}
	}
}
