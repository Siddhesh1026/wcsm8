package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath2textfunction {
  public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.drivers","./drivers/chromedriver.exe");
	
	 ChromeOptions co = new ChromeOptions();
	 co.addArguments("--remote-allow-origins=*");
	 WebDriver driver=new ChromeDriver(co);
	 driver.manage().window().maximize();
	 driver.get("https://in.puma.com/in/en");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//span[text()='Men']")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("(//h3[@class='w-full mobile:text-sm mobile:pr-0 font-bold text-base pr-5 line-clamp-2'])[1]")).click();

	 
}
}
