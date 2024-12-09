package tags.Grouping;

import org.testng.annotations.Test;

/*
/*Sanity= 	M1, m3, M5, M7, M9, M11
Functional= M1, M4, M7, M10, M12
Regression= M2, M4, M6, M8, M10, M12
Smoke= 		M3, M6, M9, M12 */
 

public class Grouping3 {
	@Test(priority=9,groups = {"Sanity","Smoke"})
	void m9() {
		System.out.println("Method 9");
	}
	@Test(priority=10,groups = {"Functional","Regression"})
	void m10() {
		System.out.println("Method 10");
	}
	@Test(priority=11,groups = {"Sanity",})
	void m11() {
		System.out.println("Method 11");
	}
	@Test(priority=12,groups = {"Functional","Regression","Smoke"})
	void m12() {
		System.out.println("Method 12");
	}
	
	
	
}
