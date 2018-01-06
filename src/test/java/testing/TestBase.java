package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

	 WebDriver driver = null;

	@BeforeTest
	public void before() {
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	}

	@AfterTest
	public void after() {
		System.out.println("111111111111111111111111111111");
	//	driver.close();
	}
}
