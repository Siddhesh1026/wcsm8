package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {
   public static void main(String[] args) throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("file:///D:/seleniumdata/HTML/SingleDropdown.html");
	
	WebElement dropDown = driver.findElement(By.name("menu"));
	Select sel = new Select(dropDown);
    Thread.sleep(2000);
    sel.selectByValue("v7");
   }
}
