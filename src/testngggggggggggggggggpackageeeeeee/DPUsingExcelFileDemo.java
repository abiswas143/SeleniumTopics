package testngggggggggggggggggpackageeeeeee;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class DPUsingExcelFileDemo {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream excelFileObj = new FileInputStream("./testdata/LoginDetails.xlsx");
		//print the username - admin
		Workbook wb = WorkbookFactory.create(excelFileObj);
		Sheet sh = wb.getSheet("LoginCredentials");
		Row r = sh.getRow(1);
		Cell c = r.getCell(0);
		String username = c.toString();
		//print the password - manager
		String password = wb.getSheet("LoginCredentials").getRow(1).getCell(1).toString();
		System.out.println(username + " : "+password);
	}
}
