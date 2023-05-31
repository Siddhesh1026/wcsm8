package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSelectorLocators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_1.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("pashtesiddhu1@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("8380843765");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='_acan _acap _acas _aj1-'")).click();

	}
}
