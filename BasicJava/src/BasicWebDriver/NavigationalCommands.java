package BasicWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Ashish\\QA\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		driver.get("https://www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
	}

}
