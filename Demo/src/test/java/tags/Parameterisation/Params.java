package tags.Parameterisation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Params {
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br)
	{
		switch(br.toLowerCase()){
		case "chrome": driver= new ChromeDriver(); break;
		case "edge": driver=new EdgeDriver();break;
		case "firefox": driver= new FirefoxDriver(); break;
		default: System.out.println("invalid browser");return;
		}
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("www.google.com");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	void openweb() {
		System.out.println("passed");
	}
	@AfterClass
	void close() {
		driver.quit();
	}
}
