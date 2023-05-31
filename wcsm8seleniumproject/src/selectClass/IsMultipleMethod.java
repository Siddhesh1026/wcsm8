package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {
   public static void main(String[] args) {
	System.setProperty("webdricver.chrome.driver","./drivers/chromedriver.exe");
	
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
    driver.get("file:///D:/seleniumdata/HTML/MultipleDropdown.html");
    //driver.get("file:///D:/seleniumdata/HTML/SingleDropdown.html");
    
    WebElement dropDown = driver.findElement(By.name("menu"));
    Select sel = new Select(dropDown);
    boolean verify = sel.isMultiple();
    System.out.println(verify);
    
}
}
