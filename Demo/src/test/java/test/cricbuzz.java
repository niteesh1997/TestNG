package test;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class cricbuzz {
	WebDriver driver;

	/*
	 * @Before public void openBrowser() { driver= new ChromeDriver();
	 * driver.get("https://www.cricbuzz.com/"); driver.manage().deleteAllCookies();
	 * driver.manage().window().maximize(); }
	 */
	@Test
	public void openProfile(){
		driver= new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='cb-ico cb-search-input-icon cb-search-input-icon-nav']")).click();
		driver.findElement(By.xpath("//a[@class='text-white cb-srch-bttn cb-srch-high-zIndex']")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Virat Kohli')]")).click();
		
		  WebElement text =
		  driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-player-bio']"
		  )); String data= text.getText(); System.out.println(data);
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
	}

	
	
}