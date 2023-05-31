package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PumaAssignment {
   public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_1.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.get("https://in.puma.com/in/en");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='×']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath(""))
	//driver.findElement(By.xpath("//span[text()='PUMA.com']")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//span[.='Menu']")).click();
	//driver.findElement(By.xpath("//span[text()='PUMA.com']/ancestor::button/descendant::span[text()='Menu']")).click();
}   
}
