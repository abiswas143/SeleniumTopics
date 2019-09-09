package testpackage;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class ListBoxDemo_UsingSelectClass extends BaseClass
{
	public static void main(String[] args) throws InterruptedException {
		driver.get("file:///C:/Users/Ajith/Music/sample%20webpages/ListBox.html");
		WebElement listBoxObj = driver.findElement(By.id("mtr"));
		Select s = new Select(listBoxObj);
		boolean multiple = s.isMultiple();
		if (multiple) {
			System.out.println("List box is MULTI SELECT");
		} else {
			System.out.println("List box is SINGLE SELECT");
		}
		System.out.println("*****Total Options present in the list box is \n********");
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions.size());
		System.out.println("********Options are \n**********");
		for (WebElement option : allOptions) {
			System.out.println(option.getText());
		}
		System.out.println("*****Select IDLY, DOSA and POORI********");
		s.selectByIndex(0);//IDLY
		Thread.sleep(2000);
		s.selectByValue("d");//DOSA
		Thread.sleep(2000);
		s.selectByVisibleText("Poori");//Both poori will be selected.
		Thread.sleep(2000);
		System.out.println("*****Total options selected are \n********");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		System.out.println(allSelectedOptions.size());
		System.out.println("*****Selected options are below \n********");
		Iterator<WebElement> itr = allSelectedOptions.iterator();
		while(itr.hasNext()){
			WebElement option = itr.next();
			System.out.println(option.getText());
		}
		System.out.println("*****First selected option in the list box is \n********");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("First selcted option is --> "+firstSelectedOption.getText());
		System.out.println("*******deselect IDLY ***********");
		s.deselectByIndex(0);
		System.out.println("First selcted option is -->"+firstSelectedOption.getText());
System.out.println("First selcted option is  --> "+s.getFirstSelectedOption().getText());
		s.deselectAll();
		driver.close();
	}
}
