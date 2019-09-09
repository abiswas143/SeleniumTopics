package testngggggggggggggggggpackageeeeeee;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPUsingDataProviderAnnotationDemo {
	@DataProvider
	public Object[][] dataBank(){
		Object[][] data = new Object[3][3];
		data[0][0] = "admin1";
		data[0][1] = "manager1";
		data[0][2] = "manager1";
		
		
		data[1][0] = "admin2";
		data[1][1] = "manager2";
		data[1][2] = "manager2";
		
		data[2][0] = "admin3";
		data[2][1] = "manager3";
		data[2][2] = "manager3";
		
		return data;
	}
	@Test(dataProvider="dataBank")
	public void testLogin(String username, String password, String confirmpassword){
		System.out.println(username + " : "+ password + " : "+ confirmpassword);
	}
}
