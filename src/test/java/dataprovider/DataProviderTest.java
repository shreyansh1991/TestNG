package dataprovider;

/**
 * http://toolsqa.com/selenium-webdriver/testng-parameters-data-provider/
 * 
 * TestNG DataProviders
 */

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	private static WebDriver driver;

	@DataProvider(name = "authentication")
	public Object[][] provideData() {
		 return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};
	//	return new Object[][]{{"a","b"},{"c","d"}};
	}
	// Here we are calling the Data Provider object with its Name

	@Test(dataProvider = "authentication")

	public void test(String sUsername, String sPassword) {
		System.out.println("Username - " + sUsername);
		System.out.println("Pass - " + sPassword);
		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.store.demoqa.com");

		driver.findElement(By.xpath(".//*[@id='account']/a")).click();

		driver.findElement(By.id("log")).sendKeys(sUsername);

		driver.findElement(By.id("pwd")).sendKeys(sPassword);

		driver.findElement(By.id("login")).click();

		driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();

		driver.quit();

	}

}
