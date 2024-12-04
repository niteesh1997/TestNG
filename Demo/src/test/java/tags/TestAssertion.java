package tags;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*
 	HardAssertion- Will fail the test if assertion fails
 	SoftAssertion- Will execute rest steps even if assertion fails
 	 			Soft assertions can be accessed by object
 	 				
 	 				SoftAssert sa = new SoftAssert();
					sa.assertEquals(expectedName,actualName);
					sa.assertAll();
			Assert.assertEquals();
			Assert.assertNotEquals();
			Assert.assertTrue();
			Assert.assertFalse();
			Assert.assertNull();
			Assert.assertNotNull();
			Assert.assertSame();
			Assert.assertNotSame();
			Assert.fail();
			
  */

public class TestAssertion {
	String expectedName= "Niteesh";
	String actualName= "Abhi";
	@Test
	void testTitle() {
		
		Assert.assertEquals(expectedName,actualName);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(expectedName,actualName);
		sa.assertAll();
	}
}
