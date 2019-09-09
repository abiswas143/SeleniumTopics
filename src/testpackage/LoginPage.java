package testpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
	
	WebDriver driver;
	//declare the elements
	@FindBy(how=How.ID,using="username")
	@CacheLookup
   private  WebElement unTB;
	@FindBy(how=How.NAME,using="pwd")
	@CacheLookup
	private WebElement pwdTB;
	@FindBy(how=How.XPATH,using = "//div[text()='Login ']")
	@CacheLookup
	private WebElement loginBtn;
	//Initialise the elements
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	//Utilise the elements
	public void setUsername(String un){
		unTB.sendKeys(un);
	}
	public void setPassword(String pwd){
		pwdTB.sendKeys(pwd);
	}
	public void clickLogin(){
		loginBtn.click();
	}
}
