package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath3Flipkart {
    public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_1.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("Hp Laptop");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	    //Thread.sleep(2000);
	    //driver.findElement(By.xpath("(//div[text()='Processor']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[.='Core i7']/preceding-sibling::div[@class='_24_Dny']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and .='Brand']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[.='HP']/preceding-sibling::div[@class='_24_Dny']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and .='Operating System']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='Windows 11']/preceding-sibling::div[@class='_24_Dny']")).click();
	    Thread.sleep(2000);
	    String firstsuggetion = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
	    System.out.println(firstsuggetion);
	    Thread.sleep(2000);
	    driver.quit();
	    
	    
	    
	}
}
