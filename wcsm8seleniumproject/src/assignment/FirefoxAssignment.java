package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirefoxAssignment {
	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver","./drivers/loginButton");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://support.mozilla.org/en-US/kb/access-mozilla-services-firefox-account");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='mzp-c-menu-title sumo-nav--link'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='mzp-c-menu-title sumo-nav--link'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='sumo-button secondary-button button-lg']")).click();

	}
}
