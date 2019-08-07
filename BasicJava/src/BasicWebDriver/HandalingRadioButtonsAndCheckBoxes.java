package BasicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandalingRadioButtonsAndCheckBoxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Ashish\\QA\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_1']")).click();
		//driver.findElement(By.xpath("//label[contains(@id,'Round Trip')")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		driver.close();
		
		}

}
