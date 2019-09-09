package testpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
public class TestLogin{
	public static void main(String[] args) throws InterruptedException {
		int n = 5;
		int sp = n-1;
		int st = 1;
		for (int i = 1; i <= n  ; i++) {
			//print space
			for (int j = 1; j < sp ; j++) {
				System.out.print(" ");
			}
			int eleCount = 1;
			//Print star
			for (int k = 1; k <= st; k++) {
				if (eleCount <= st/2) {
					k++;
				} else {
					k--;
				}
				
				System.out.print(k);
			}
			
			sp--;
			st=st+2;
			System.out.println();
		}
	}
}
