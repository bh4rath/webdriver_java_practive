package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {
	private WebDriver driver;

	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();

		WebElement inputs = driver.findElement(By.linkText("Shifting Content"));
		inputs.click();

		WebElement menuLink = driver.findElement(By.linkText("Example 1: Menu Element"));
		menuLink.click();

		List<WebElement> links = driver.findElements(By.tagName("li"));
		System.out.println(links.size());

	}

	public static void main(String args[]) {
		BaseTests test = new BaseTests();
		test.setUp();
	}
}
