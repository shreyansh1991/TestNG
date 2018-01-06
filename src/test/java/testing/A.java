package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A extends TestBase {
	@Test
	public void abc() {
		System.out.println(driver.getTitle());
		System.out.println("india");
	}
}
