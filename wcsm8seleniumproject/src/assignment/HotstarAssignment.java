package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HotstarAssignment {
       public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_1.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in/subscribe/sign-in?returnURL=/in/subscribe/my-account");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']")).sendKeys("9834871059");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		
	}
}
