package tags;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/*@Test(dataProvider = "dp1")
void Login(String email,String pass) {
	}
@DataProvider(name="dp1")
	void loginData() {
	
	}

@Test(dataProvider = "dp2")
void Login(String email,String pass) {
	}
@DataProvider(name="dp2")
	void loginData() {
	
	@DataProvider(name="dp2",indices={0,1}) //this will execute only 1st and 2nd input data
	}*/

public class DataProviderTest {
	@Test(dataProvider = "dp")
	void Login(String email,String pass) {
		System.out.println("login mail is "+email );
		System.out.println("login Pass is "+pass);
	}
	@DataProvider(name="dp")
	Object[][] loginData() {
		Object data[][]= {
						{"niteeshxyz@gmail.com","adc123"},
						{"niteeshabc@gmail.com","abc234"},
						{"niteeshmno@gmail.com","abc345"},
						{"niteeshpqr@gmail.com","abc456"}
					};
		return data;
	}
	
}
