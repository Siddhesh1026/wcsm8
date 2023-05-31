package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getcssSelector {
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	WebElement loginbutton = driver.findElement(By.xpath("//button[contains(@class,'oxd-button ')]"));
	String value = loginbutton.getCssValue("color");
	System.out.println(value);
}
}
