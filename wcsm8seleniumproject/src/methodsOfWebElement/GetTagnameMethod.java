package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagnameMethod {
    public static void main(String[] args) {
		System.setProperty("webdriver,chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://laptop-7de8ii5v/login.do");
		
		WebElement usn = driver.findElement(By.name("username"));
		String tagname = usn.getTagName();
		System.out.println(tagname);
	}
}
