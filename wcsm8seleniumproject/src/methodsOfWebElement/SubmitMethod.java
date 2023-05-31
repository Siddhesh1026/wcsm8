package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("http://laptop-7de8ii5v/login.do");
	
	driver.findElement(By.name("username")).sendKeys("admin");
	
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	WebElement loginbutton = driver.findElement(By.xpath("//a[.='Login']"));
	loginbutton.submit();
}
}
