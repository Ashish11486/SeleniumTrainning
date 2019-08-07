package BasicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirefox {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Ashish\\QA\\Software\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	driver.get("https://www.surveymonkey.com/");
	driver.findElement(By.linkText("LOG IN")).click();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("seleniumtraining");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("selenium1234");
	String UserNameval = driver.findElement(By.id("username")).getAttribute("value");
	System.out.println("UserName Entered is "+UserNameval);		
	
	String Pwd = driver.findElement(By.id("password")).getAttribute("value");
	System.out.println("Pwd Entered is "+Pwd);				
	driver.close();
}
}

//table/tbody/tr[1]/td[1]