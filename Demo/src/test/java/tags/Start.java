package tags;

import org.testng.annotations.Test;

/*	1) TestNG Executes the methods based on alphabetical order
	2) @Test(priority=num) controls the order of execution. 
	3)Once you provide priority to the test methods, then order of methods is not considered
	4) Priorities can be random numbers
	5) If you dont want provide priority the default value is zero
	6) If the priorities are same then again execute methods in alphabetical order
	7) Negitive values are allowed in priority
	8) TestNG execute test methods only if they are having @Test annotations
*/
public class Start {
	
	 @Test(priority=-1)
	 void openApp() {
		System.out.println("Opening App");
	 }
	 @Test(priority=0)
	 void login() {
		 System.out.println("login Successfull");

	 }
	 @Test(priority = 1)
	 void logout() {
		 System.out.println("logout Successfull");
		 
	 }
	 
}
