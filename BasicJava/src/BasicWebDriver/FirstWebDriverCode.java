package BasicWebDriver;


public class FirstWebDriverCode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Ashish\\QA\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String Title = driver.getTitle();
		System.out.println("Application title is : " + Title);
		if (Title.equalsIgnoreCase("Google")) 
		{
			System.out.println("Pass--> Google application is opened");
		}else
		{
			System.out.println("Fail--> Google application is not opened");
		}
		System.out.println("URL is " +driver.getCurrentUrl());
		
		driver.close();
		
	}

}
