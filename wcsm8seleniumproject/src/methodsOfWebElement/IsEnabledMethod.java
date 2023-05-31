package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
  public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.name("username")).sendKeys("sp1@gmail.com");
	
	driver.findElement(By.name("password")).sendKeys("sp123");
	
	WebElement loginbutton = driver.findElement(By.xpath("(//div[.='Log in'])[2]"));
	boolean status = loginbutton.isEnabled();
	System.out.println(status);
	}
}
