package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SQL {
	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/?use SSL=true", "root",
				"Akp_11486");
		System.out.println("sucess");

		Statement st = con.createStatement();
		ResultSet rs = st
				.executeQuery("select * from surveymonkey.userdetails");

		while (rs.next()) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Ashish\\QA\\Software\\chromedriver.exe");
			WebDriver driver1 = new ChromeDriver();

			driver1.manage().window().maximize();
			driver1.get("https://www.surveymonkey.com/");
			driver1.findElement(By.linkText("LOG IN")).click();
			System.out.println(rs.getString("username"));
			System.out.println(rs.getString("password"));
			driver1.findElement(By.xpath("//input[@id='username']")).sendKeys(
					rs.getString("username"));
			driver1.findElement(By.xpath("//input[@id='password']")).sendKeys(
					rs.getString("password"));
			driver1.close();

		}
		rs.close();
	}
}

/*
 * } // Object of Connection from the Database Connection conn = null;
 * 
 * // Object of Statement. It is used to create a Statement to execute the query
 * Statement stmt = null;
 * 
 * //Object of ResultSet => 'It maintains a cursor that points to the current
 * row in the result set' ResultSet resultSet = null;
 * Class.forName("com.mysql.jdbc.Driver");
 * 
 * // Open a connection conn = DriverManager.getConnection(
 * "jdbc:mysql://localhost:3306/surveymonkey?useSSL=true", "root", "123456789");
 * 
 * // Execute a query stmt = conn.createStatement();
 * 
 * resultSet = stmt.executeQuery("select * from userdetails"); while (resultSet
 * .next()) { System.out.println(resultSet .getString(1)); }
 * 
 * if (resultSet != null) { try { resultSet.close(); } catch (Exception e) { } }
 * 
 * if (stmt != null) { try { stmt.close(); } catch (Exception e) { } }
 * 
 * if (conn != null) { try { conn.close(); } catch (Exception e) { } } } }
 */

