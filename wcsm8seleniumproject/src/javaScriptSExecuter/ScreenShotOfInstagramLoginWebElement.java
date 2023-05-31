package javaScriptSExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotOfInstagramLoginWebElement {
    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.instagram.com");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,350)");	
		}
}
