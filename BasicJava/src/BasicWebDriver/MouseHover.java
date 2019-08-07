package BasicWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https:\\www.amazon.in");

		
		WebElement shopByCat = driver
				.findElement(By.id("nav-link-shopall"));
		Actions hover = new Actions(driver);
		hover.moveToElement(shopByCat).perform();

		WebElement mobile = driver
				.findElement(By.xpath("//span[contains(text(),'Mobiles, Computers')]"));
		hover.moveToElement(mobile).perform();
		driver.findElement(By.xpath("//span[contains(text(),'Power Banks')]")).click();	

	}

}
