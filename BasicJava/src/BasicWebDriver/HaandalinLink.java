package BasicWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HaandalinLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Ashish\\QA\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.surveymonkey.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linkCount = links.size();
		System.out.println("Total number of links are : "+linkCount);
		for (int i = 0; i < linkCount; i++)
		{
			
			String link = links.get(i).getText();
			System.out.println(link);
		}
		
		String loginLink = driver.findElement(By.linkText("LOG IN")).getText();
		//System.out.println(loginLink);
		//driver.findElement(By.linkText("LOG IN")).click();
		
		driver.close();
		

	}

}
