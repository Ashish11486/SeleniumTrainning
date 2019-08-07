package BasicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandalingTextFields {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Ashish\\QA\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.surveymonkey.com/");
		driver.findElement(By.linkText("LOG IN")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("seleniumtraining");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("selenium1234");
		String UserNameval = driver.findElement(By.id("username")).getAttribute("value");
		System.out.println("UserName Entered is "+UserNameval);		
		/*driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@id='userAcctTab_MainMenu']")).click();
		driver.findElement(By.xpath("//ul[contains(@class,'nav-submenu')]//a[contains(text(),'Sign Out')]")).click();
		*/
		String Pwd = driver.findElement(By.id("password")).getAttribute("value");
		System.out.println("Pwd Entered is "+Pwd);				
		driver.close();
	}
}
