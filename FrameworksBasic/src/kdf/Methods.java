package kdf;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Methods {
	static WebDriver driver;

	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Ashish\\QA\\Software\\chromedriver_win32 (76.0.3809.68)\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void maximizeBrowser() {
		driver.manage().window().maximize();
	}

	public static void implementWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void navigateTo(String baseURL) {
		driver.get(baseURL);
	}

	public static void enterInvalidUsername(String value, String param) {
		driver.findElement(By.xpath(value)).sendKeys(param);
	}

	public static void enteriInvalidPassword(String value, String param) {
		driver.findElement(By.xpath(value)).sendKeys(param);
	}

	public static void clickSubmit(String value) {
		driver.findElement(By.xpath(value)).click();
	}

	public static void varifyMessage(String locator ,String value, String message){
		String ActualMessage = null;
		if (locator.equals("xpath")) {
			ActualMessage = driver.findElement(By.xpath(value)).getText();
		}else if (locator.equals("css")) {
			ActualMessage = driver.findElement(By.cssSelector(value)).getText();
		}
			String ExpectedMessage = message;
		Assert.assertEquals(ActualMessage,ExpectedMessage);
	}
	
	public static void closeBrowser(){
		driver.close();
	}
	
}
