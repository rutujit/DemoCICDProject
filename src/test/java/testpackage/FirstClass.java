package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstClass {
	
	public WebDriver driver;
	
	@Test
	public void firstTest()
	{
		System.out.println("Test Case 1");
	}

	@Test
	public void secondTest() {
		System.out.println("Second test");
	}
	
	@Test
	public void launchBrowserTest()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}
	
	@Test
	public void failedTest()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://pmmssaviantvm.centralindia.cloudapp.azure.com/account/login");
		driver.findElement(By.name("password2"));
	}
}

