package testpackage;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class HandleMultipleBrowserWindowsDemo extends BaseClass{
	public static void main(String[] args) {
		driver.get("https://www.naukri.com/");
		//Print the window handle id of Parent browser window
		String parentWH = driver.getWindowHandle();
		System.out.println("Parent window handle id is --> "+parentWH);
		//Print the total number of browser windos present
		Set<String> allWHs = driver.getWindowHandles();
		System.out.println("Total windowds are : --> "+allWHs.size());//4
		//Print the Window handle id and the title of all the browser windows
		/*for (String wh : allWHs) {
			driver.switchTo().window(wh);
			System.out.println(wh + " --> " +driver.getTitle());
			//driver.close()
		}*/
		//close all the browser windows at once
		//driver.quit();
		/*//close only the parent window
		for (String wh : allWHs) {
			driver.switchTo().window(wh);
			if (wh.equals(parentWH)) {
				driver.close();
			}
		}*/
		/*//close all the child windows except the parent window
				for (String wh : allWHs) {
					driver.switchTo().window(wh);
					if (!wh.equals(parentWH)) {
						driver.close();
					}
				}*/
		
		//close a specific window - Genpact
		for (String wh : allWHs) {
			driver.switchTo().window(wh);
			String actTitle = driver.getTitle();
			if (actTitle.equals("Genpact")) {
				driver.close();
			}
		}
	}
}
