package autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * Upload multiple files in Selenium
 * 
 * @author Shreyansh
 *
 */
/*
 * 
 * Auto IT Script 
 * 
 * 
 * 
$vVariable = """C:\Users\Shreyansh\Desktop\Automation\11036894-CTC.Pdf"" ""C:\Users\Shreyansh\Desktop\Automation\11036894-IT.Pdf"""
ControlFocus("File Upload","","Edit1")
ControlSetText("File Upload","","Edit1",$vVariable)
ControlClick("File Upload","","Button1")

 * 
 * */
public class MultiFileUpload {

	public static void main(String[] args) throws IOException, InterruptedException, Exception {

		// System.setProperty("webdriver.chrome.driver",
		// "./exefiles/chromedriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("file:///C:/Users/Shreyansh/Desktop/multiplefile.html");

		driver.findElement(By.xpath("html/body/input[@name='img']")).click();

		Thread.sleep(5000);

		Runtime.getRuntime().exec("C:\\Users\\Shreyansh\\Desktop\\autoit\\uploadmultiplefile.exe");
		System.out.println("congrats!!!");

	}

}