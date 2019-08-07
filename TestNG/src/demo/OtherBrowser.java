package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class OtherBrowser {
	WebDriver driver;
	@Test
	public void chromeBrowser(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.close();
	}
	@Test
	public void openIEBrowser(){
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.close();
	}		
		
	@Test
	public void foxBrowser(){
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.yahoo.com");
		driver.close();
	}
	@Test
	public void EdgeBrowser(){
		System.setProperty("webdriver.edge.driver", "MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.close();
	}
	
	
}
