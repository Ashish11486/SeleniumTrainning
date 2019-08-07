package ddf;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import utils.ReadExcel;

public class NewtoursNegativeTesting extends BaseTest{
	WebDriver driver;

	/*@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}*/

	@Test
	public void applicationTest() throws IOException {
		String[][] data = ReadExcel.getData("C:\\Ashish\\QA\\Software\\Data\\TestData.xlsx",
				"InvalidCredentials");

		for (int i = 1; i < data.length; i++) {
			String username = data[i][1].trim();
			String password = data[i][2].trim();
			driver.findElement(By.name("userName")).clear();
			driver.findElement(By.name("userName")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			
			boolean signOnPresent = driver.findElement(By.linkText("SIGN-ON"))
					.isDisplayed();
			Assert.assertTrue(signOnPresent);
			driver.navigate().back();
		}
	}

	/*@AfterTest
	public void closeBrowser() {
		driver.close();
	}*/

}
