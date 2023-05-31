package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppersStack {
    private static final By Checkbox = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//apply the implicity wait the appear the webelement
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.shoppersstack.com/");
		
		driver.findElement(By.xpath("(//div[@class='featuredProducts_cardBody__MDlEh'])[1]")).click();
		driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("411033");
		
		//apply the Explicit wait to webelement
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//WebElement checkbutton =new driver(By.id("Check"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Checkbox));
		
		
		
	}
}
