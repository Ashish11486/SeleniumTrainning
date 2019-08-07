package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VarifyTitle {
	WebDriver driver;
	@BeforeTest
	public void OpenBrowser(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void VarifyTitle(){
		driver.get("https:\\www.facebook.com");
		String Actual = driver.getTitle();
		String Expected = "Facebook - Log In or Sign Up";
		Assert.assertEquals(Actual, Expected);
		/*if (Expected.equalsIgnoreCase(Actual)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}*/
	}
	@AfterTest	
	public void CloseBrowser(){
		driver.close();
	}

	/*public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https:\\www.facebook.com");

		String Actual = driver.getTitle();
		System.out.println(Actual);
		String Expected = "Facebook - Log In or Sign Up";
		if (Expected.equalsIgnoreCase(Actual)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
		driver.close();
	}
*/
}
