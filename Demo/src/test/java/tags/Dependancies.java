package tags;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*
 	Dependancy will be created in methods to execute only when previous method is executed
  	@Test(dependsOnMethods= {"MethodName","MethodNmae2})
  
 */

public class Dependancies {
	@Test(priority = 1)
	void openApp() {
		
		Assert.assertTrue(true);
	}
	@Test(dependsOnMethods = "openApp")
	void login()
	{
		Assert.assertTrue(true);
	}
	@Test(dependsOnMethods = "login")
	void search() {
		Assert.assertTrue(true);
	}
	@Test(dependsOnMethods ="login" )
	void logout() {
		Assert.assertTrue(true);
	}
}
