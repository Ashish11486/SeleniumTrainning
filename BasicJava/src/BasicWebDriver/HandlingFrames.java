package BasicWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {
//webdriver
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		
		
		System.out.println("total no of frames: "+frames.size());
		
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		//System.out.println(draggtext);
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).build().perform();
		WebElement target1 = driver.findElement(By.xpath("//div[@id='droppable']"));;
		actions.clickAndHold(source).moveToElement(source,250,50).release(target1 ).build().perform();
		driver.switchTo().defaultContent();
		/*driver.findElement(By.linkText("Selectable")).click();
		driver.findElement(By.xpath("//a[@tabindex='0']")).click();*/
		
		
		//driver.close();

	}
}
