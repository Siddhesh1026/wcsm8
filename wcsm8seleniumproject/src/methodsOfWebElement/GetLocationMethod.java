package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetLocationMethod {
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.selenium.dev/downloads/");
	
	WebElement download = driver.findElement(By.xpath("//h1[.='Downloads']"));
	Point loc = download.getLocation();
	
	int xaxis = loc.getX();
	int yaxis = loc.getY();
	
	System.out.println("x axis :"+ xaxis+"y axis :"+yaxis);
	
}
}
