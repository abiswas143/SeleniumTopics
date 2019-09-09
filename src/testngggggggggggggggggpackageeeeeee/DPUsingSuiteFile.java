package testngggggggggggggggggpackageeeeeee;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class DPUsingSuiteFile {
	@Parameters({"username","password"})
	@Test
	public void testDataParameterisation(String username, String password){
		System.out.println(username + " : "+ password);
	}
}
