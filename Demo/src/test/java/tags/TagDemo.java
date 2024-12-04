package tags;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TagDemo {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("we are at beforeSuite"); 
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("we are at beforeTest"); 
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("we are at beforeClass"); 
	}
	@Test(priority = 1)
	public void login() {
		System.out.println("login successfull 0");
		int i= 1/0;
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("we are at beforeMethod"); 
	}
	@Test(priority = 2, dependsOnMethods ="login" )
	public void login2() {
		System.out.println("login successfull 2");
	}
	@Test(priority = 3)
	public void login1() {
		System.out.println("login successfull 1");
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("we are afterMethod"); 
	}
	@AfterClass
	public void afterClass() {
		System.out.println("we are at afterClass"); 
	}
	@AfterTest
	public void afterTest() {
		System.out.println("we are at afterTest"); 
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("we are at afterMethod"); 
	}

}
