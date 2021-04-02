package variables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fireFox {

	public WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://locator.chase.com/");

	}

	@Test
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test
	public void getUrl() {
		System.out.println(driver.getCurrentUrl());
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}