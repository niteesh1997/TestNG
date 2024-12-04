package tags;

import org.testng.annotations.Test;

/*
	Class1- M1, M2, M3, M4
	Class2- M5, M6, M7, M8
	Class3- M9, M10, M11, M12
	
	Sanity= 	M1, m3, M5, M7, M9, M11
	Functional= M1, M4, M7, M10, M12
	Regression= M2, M4, M6, M8, M10, M12
	Smoke= 		M3, M6, M9, M12 
 */

public class Grouping {
	@Test(priority=1,groups = {"Sanity","Functional"})
	void m1() {
		System.out.println("Method 1");
	}
	@Test(priority=2,groups = {"Regression"})
	void m2() {
		System.out.println("Method 2");
	}
	@Test(priority=3,groups = {"Sanity","Smoke"})
	void m3() {
		System.out.println("Method 3");
	}
	@Test(priority=4,groups = {"Functional","Regression",})
	void m4() {
		System.out.println("Method 4");
	}
	
	
	
}
