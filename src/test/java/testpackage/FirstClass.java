package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstClass {
	
	public WebDriver driver;
	
	@Test
	public void testFirst()
	{
		System.out.println("Test Case 1");
	}

	@Test
	public void testSecond() {
		System.out.println("Second test");
	}
	
	@Test
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}
}
