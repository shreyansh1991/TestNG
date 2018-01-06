package a.b;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Demo {
	static WebDriver driver;
	@FindBy(how = How.XPATH, using = "//div[@id='rb-calendar_onward_cal']//td")
	List<WebElement> StartDate;

	Demo() {
		PageFactory.initElements(driver, this);
	}

	public void bookbusticket() throws InterruptedException {
		System.out.println("hi");
		driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
		// (//table[@class='rb-monthTable first last'])[1]//td
		// List<WebElement> list=
		// driver.findElements(By.xpath("(//table[@class='rb-monthTable first
		// last'])[1]//td[@class='wd day']"));
	//	String js = "arguments[0].removeAttribute('class');";
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].removeAttribute('class')",
				driver.findElements(By.xpath("(//div[@class='rb-calendar hide'])[1]//td")));
		List<WebElement> list = driver
				.findElements(By.xpath("//div[@id='rb-calendar_return_cal']//td"));
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			String date = list.get(i).getText();
			System.out.println("date - " + date.trim());
		}

	}

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+File.separator+"exe1"+File.separator+"geckodriver.exe");
		/*
		 * DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 * capabilities.setCapability("marionette", true);
		 * capabilities.setBrowserName("firefox");
		 * capabilities.setPlatform(Platform.ANY);
		 */

		// FirefoxOptions options = new FirefoxOptions();
		// options.setBinary("C:\\Program Files (x86)\\Mozilla
		// Firefox\\firefox.exe"); //This is the location where you have
		// installed Firefox on your machine
		driver = new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		Demo demo = new Demo();
		demo.bookbusticket();
	}
}