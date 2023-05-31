package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextLocators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/seleniumdata/HTML/AmazonLinks.html");
		Thread.sleep(2000);
		driver.findElement(By.linkText("AMAZONLINK")).click();

	}
}
