package BasicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDowns {

	public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver","C:\\Ashish\\QA\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("jan");
		Thread.sleep(3000);
		Select select = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		select.selectByVisibleText("Feb");
		Thread.sleep(3000);
		select.selectByValue("3");
		Thread.sleep(3000);
		select.selectByIndex(4);
	}

}
