package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserTesting {
	
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void OpenBrowser(String browser){
		if(browser.equalsIgnoreCase("Chrome")){
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase( "edge")) {
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https:\\www.facebook.com");
	}
	@Test(priority=1)
	public void verifyTitle(){
		String Actual = driver.getTitle();
		String Expected = "Facebook - Log In or Sign Up";
		Assert.assertEquals(Actual, Expected);
	}
	@Test(priority=2)
	public void verifyText1(){
		boolean ActualText1 = driver.getPageSource().contains(" Connect with friends and the");
		Assert.assertTrue(ActualText1);
		/*String ActualText = driver.findElement(By.xpath("//h2[@class='inlineBlock _3ma _6n _6s _6v']")).getText();
		String ExpectedText = "Connect with friends and the world around you on Facebook.";
		Assert.assertEquals(ActualText, ExpectedText);*/
	}
	@Test(priority=3)
	public void verifyText2(){
		String ActualText = driver.findElement(By.cssSelector("#content > div > div > div > div > div._7d._6_._76 > div:nth-child(2) > div._6a._6b.product_desc > span.mtl._3ma._6p._6s._6v")).getText();
		String ExpectedText = "See photos and updates";
		Assert.assertEquals(ActualText, ExpectedText);
	}
	@Test(priority=4)
	public void verifyText3(){
		boolean ActualText1 = driver.getPageSource().contains("Sign Up");
		Assert.assertTrue(ActualText1);			
	}
	@Test(priority=5)
	public void varifyRadioButton(){
		boolean Female = driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).isSelected();
		Assert.assertFalse(Female);
	}
	@AfterTest	
	public void CloseBrowser(){
		driver.close();
	}
}
