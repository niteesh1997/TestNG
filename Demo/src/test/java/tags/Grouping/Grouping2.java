package tags.Grouping;

import org.testng.annotations.Test;

/*Sanity= 	M1, m3, M5, M7, M9, M11
Functional= M1, M4, M7, M10, M12
Regression= M2, M4, M6, M8, M10, M12
Smoke= 		M3, M6, M9, M12 */

public class Grouping2 {
	@Test(priority=5,groups = {"Sanity",})
	void m5() {
		System.out.println("Method 5");
	}
	@Test(priority=6,groups = {"Regression","Smoke"})
	void m6() {
		System.out.println("Method 6");
	}
	@Test(priority=7,groups = {"Sanity","Functional"})
	void m7() {
		System.out.println("Method 7");
	}
	@Test(priority=8,groups = {"Regression"})
	void m8() {
		System.out.println("Method 8");
	}
}
