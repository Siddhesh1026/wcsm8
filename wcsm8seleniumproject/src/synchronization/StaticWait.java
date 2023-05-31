package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaticWait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("pashtesiddhu1@gmail.com");

		driver.findElement(By.name("password")).sendKeys("9146299718");
		
		driver.findElement(By.xpath("(//div[.='Log in'])[2]")).click();
	}
}
