package testngggggggggggggggggpackageeeeeee;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Demo {
	@Test(priority=1)
	public void createUser(){
		System.out.println("createUser....");
	}
	@Test(priority=2)
	public void editUser(){
		System.out.println("editUser....");
	}
	/*@Test(priority=3, dependsOnMethods="createUser")
	public void deleteUser(){
		System.out.println("deleteUser....");
	}*/
}
