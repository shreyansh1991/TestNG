package a.b;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Application {
	@BeforeClass
	public void init()
	{
		System.out.println("init");
	}
 @Test
 public void abc()
 {
	 WebDriver driver=new FirefoxDriver();
	 
	 System.out.println("abc");
 }
 @Test
 public void abc1()
 {
	 System.out.println("abc1");
 }
 @AfterClass
 public void tearDown()
 {
	 System.out.println("tearDown");
 }
}