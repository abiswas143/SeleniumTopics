package testngggggggggggggggggpackageeeeeee;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import testpackage.BaseClass;
public class ListBoxDemo_usingSelectClass extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		driver.get("file:///C:/Users/Ajith/Music/sample%20webpages/ListBox.html");
		//check whether the list box is single select or multi select ?
		Select s = new Select(driver.findElement(By.id("mtr")));
		System.out.println(s.isMultiple() + " --> list box is multi select..");
		//Print the total number of options present in the list box.
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions.size());//5
		for (WebElement option : allOptions) {
			System.out.println(option.getText());
		}
		//select idly
		s.selectByIndex(0);//idly
		Thread.sleep(2000);
		s.selectByValue("d");//dosa
		Thread.sleep(2000);
		s.selectByVisibleText("Poori");//2 pooris
		Thread.sleep(2000);
		//print the total number of selected options and print the options
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		System.out.println(allSelectedOptions.size());//4
		
		
		
		
		Iterator<WebElement> itr = allSelectedOptions.iterator();
		while(itr.hasNext()){
			WebElement selectedOption = itr.next();
			System.out.println(selectedOption.getText());
		}
		System.out.println("*******First selected option is below********");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("1."+firstSelectedOption.getText());
		//deselect idly 
		s.deselectByIndex(0);
		Thread.sleep(2000);
		System.out.println("2. "+s.getFirstSelectedOption().getText());
		s.deselectAll();
	}
}
