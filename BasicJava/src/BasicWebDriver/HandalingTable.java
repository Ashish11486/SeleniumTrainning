package BasicWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandalingTable 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Ashish\\QA\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Object[][] table = new String[10][10];
		driver.get("https://www.toolsqa.com/automation-practice-table");
		List<WebElement> rows = driver.findElements(By.xpath("//table//tbody[1]//tr[1]//td"));
		//System.out.println("Total numbers of rows are :"+rows.size());
		
		int i = 0;	
			for (int j = 0; j < rows.size(); j++)
			{
				table[i][j]=rows.get(j).getText();			
				System.out.print(" "+table[i][j]+" | ");
			}
		List<WebElement> rows1 = driver.findElements(By.xpath("//table//tbody[1]//tr[2]//td"));		
			
		int i1 = 1;	
		System.out.print("\n");
			for (int j = 0; j < rows1.size(); j++)
			{
				table[i1][j]=rows1.get(j).getText();
				System.out.print(" "+table[i1][j]+" | ");
			}
		List<WebElement> rows2 = driver.findElements(By.xpath("//table//tbody[1]//tr[3]//td"));
		
		int i11 = 1;	
		System.out.print("\n");
			for (int j = 0; j < rows2.size(); j++)
			{
				table[i11][j]=rows2.get(j).getText();
				System.out.print(" "+table[i11][j]+" | ");
			}
		
		List<WebElement> rows3 = driver.findElements(By.xpath("//table//tbody[1]//tr[4]//td"));
		int i111 = 1;	
		System.out.print("\n");
			for (int j = 0; j < rows3.size(); j++)
			{
				table[i111][j]=rows3.get(j).getText();
				System.out.print(" "+table[i111][j]+" | ");
			}
		
		driver.close();

	}
	
}
