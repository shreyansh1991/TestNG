package a.b;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
	WebDriver driver;

	@BeforeMethod
	public void init() {
		
		driver = new FirefoxDriver();
	}

	@Test
	public void a() {
		
		driver.get("https://www.google.com");
		System.out.println("a");
		driver.close();
	}

	@Test
	public void b() {
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.guru99.com");
		System.out.println("b");
		driver.close();
	}

		
}
