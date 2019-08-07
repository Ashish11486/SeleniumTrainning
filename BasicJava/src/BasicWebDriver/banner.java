package BasicWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class banner {
public static void main(String[] args) {
	WebDriver driver;
/*	ChromeOptions option = new ChromeOptions();
	option.addArguments("disable-infobars");
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://huddle.eurostarsoftwaretesting.com/how-to-selenium-popups-with-selenium/");
	driver.findElement(By.xpath("//a[@id='cookie_action_close_header']")).click();*/
	System.setProperty("webdriver.chrome.driver", "C:\\Ashish\\QA\\Software\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.tutorialspoint.com");
	driver.findElement(By.id("banner-accept")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Videos')]")).click();
	
	

}
}
