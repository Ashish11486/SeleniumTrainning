package BasicWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notifications {
public static void main(String[] args) {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver","C:\\Ashish\\QA\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://wordpressdemo.webkul.com/wordpress-latest-tweets/");
	driver.close();
	
}
}
