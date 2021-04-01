package variables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edge {

	public WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://locator.chase.com/");

	}

	@Test
	public void getTitle() {
		String Title = driver.getTitle();
		System.out.println("Title");

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
