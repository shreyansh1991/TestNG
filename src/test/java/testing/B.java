package testing;

import org.testng.annotations.Test;

public class B extends TestBase {
	@Test
	public void abc() {
		System.out.println("driver ::     " + driver);
		System.out.println(driver.getTitle());
		System.out.println("bhutan");

	}
}
