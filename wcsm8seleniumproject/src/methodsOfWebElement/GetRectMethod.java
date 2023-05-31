package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetRectMethod {
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.selenium.dev/downloads/");
	
	WebElement download = driver.findElement(By.xpath("//h1[.='Downloads']"));
	Rectangle rect = download.getRect();
	
	int xaxis = rect.getX();
	int yaxis = rect.getY();
	
	int height = rect.getHeight();
	int width = rect.getWidth();
	
	System.out.println(xaxis);
	System.out.println(yaxis);
	System.out.println(height);
	System.out.println(width);
	
	
}
}
