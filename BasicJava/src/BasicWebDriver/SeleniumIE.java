package BasicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumIE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver","C:\\Ashish\\QA\\Software\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_1']")).click();
		//driver.findElement(By.xpath("//label[contains(@id,'Round Trip')")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		driver.close();
		
		
		
		/*driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("jan");
		Thread.sleep(3000);
		Select select = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		select.selectByVisibleText("Feb");
		Thread.sleep(3000);
		select.selectByValue("3");
		Thread.sleep(3000);
		select.selectByIndex(4);*/
		/*driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		WebElement target = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
		//System.out.println(draggtext);
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).build().perform();
		//actions.clickAndHold(source).moveToElement(source,250,50).release(target1).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Selectable")).click();
		driver.findElement(By.xpath("//a[@tabindex='0']")).click();
		
		
		//driver.close();
*/
	}

}
