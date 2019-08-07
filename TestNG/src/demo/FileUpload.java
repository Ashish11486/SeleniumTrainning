package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpload {
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\Ashish\\QA\\Software\\chromedriver_win32 (76.0.3809.68)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/upload");
	}
	
	@Test
	public void uploadFile(){
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Ashis\\QA\\Software\\Data\\TestData.xlsx");
		driver.findElement(By.id("file-submit")).click();
		String EX ="File Uploaded!";
		String AC = driver.findElement(By.cssSelector("#content > div > h3")).getText();
		Assert.assertEquals(AC, EX);
	}

}
