package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TagNameLocators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_1.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	    WebDriver driver=new ChromeDriver(co);
	    driver.manage().window().maximize();
	    driver.get("file:///D:/seleniumdata/HTML/Username.html");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.tagName("input")).sendKeys("admin");
	    //................................................................................................................................................
	    driver.navigate().to("https://app.fireflink.com/signin");
	    Thread.sleep(2000);
	    driver.findElement(By.tagName("input")).sendKeys("siddhupashte123@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.tagName("input")).sendKeys("Siddhu@123");
	    
	    
		
	}

}
