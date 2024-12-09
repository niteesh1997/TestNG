package tags.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*
	1) Method1- pass, Methos2-Fail, Method3- pass
	2)listener class should be created
	ITestListener is built in interface
	3) XML file runs 2 classes
*/

public class Listeners {
	@Test	
	void openApp() {
		Assert.assertEquals(true, true);
	}
	@Test(dependsOnMethods = "openApp")
	void login() {
		Assert.assertEquals(true, false);
	}
	@Test(dependsOnMethods= {"openApp","login"})
	void logout() {
		Assert.assertEquals(true, true);
	}
}
