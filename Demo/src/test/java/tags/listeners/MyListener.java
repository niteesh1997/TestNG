package tags.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/*
 ITestListener interface has defined methods which can be implemented based on our requirement
 where as TestListenerAdaptor is class that has methods which are already defined we can use them directly
*/


public class MyListener implements ITestListener{
	public void onStart(ITestContext context) {
	    System.out.println("OnStart");
	  }
	public void onTestStart(ITestResult result) {
		System.out.println("OnTestStart");
	  }
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");
	  }
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");
	  }
	public void onTestSkipped(ITestResult result) {
		System.out.println("OnTesSkipped");
	  }
}
