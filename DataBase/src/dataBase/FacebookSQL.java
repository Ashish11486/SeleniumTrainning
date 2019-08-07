package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSQL {

	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/surveymonkey?use SSL=true", "root", "Akp_11486");
		System.out.println("connection successful");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from surveymonkey.facebook");
		while (rs.next()) 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Ashish\\QA\\Software\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(rs.getString("username"));
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(rs.getString("password"));
			driver.close();
			
		}

	}

}
