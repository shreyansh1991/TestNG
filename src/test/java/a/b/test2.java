package a.b;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test2 {

	WebDriver driver;

	@BeforeMethod
	public void init() {

		driver = new FirefoxDriver();
	}

	@Test
	public void c() {
		// WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		System.out.println("c");
		driver.close();
	}

	@Test
	public void d() {
		// WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		System.out.println("d");
		driver.close();
	}

}
