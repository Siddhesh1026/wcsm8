package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SendkeysMethod {
   /**
 * @param args
 * @throws InterruptedException
 */
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("http://laptop-7de8ii5v/login.do");
	
	WebElement usernameTB = driver.findElement(By.name("username"));
	usernameTB.sendKeys("admin123");
	
	WebElement passwordTB = driver.findElement(By.name("pwd"));
	passwordTB.sendKeys("manager123");
	Thread.sleep(2000);
	driver.navigate().refresh();
	usernameTB.sendKeys("admin123");
	Thread.sleep(2000);
	passwordTB.sendKeys("manager123");
	
	
}
}
