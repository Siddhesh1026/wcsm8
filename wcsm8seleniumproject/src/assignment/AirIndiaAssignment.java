package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirIndiaAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_1.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.tripodeal.com/airline/air-india?utm_source=google_indigo&gclid=Cj0KCQjw27mhBhC9ARIsAIFsETEAGVCJ138uyl_2vD6u8TqYQHHFVqlbkM9z-D0Im-oHLzgMonG837caArYLEALw_wcB");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='origin']")).sendKeys("Pune");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='text']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@class='formRow--input js-input addclearbutton'])[2]")).sendKeys("BLR Bangalore, India");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='formRow--item'])[5]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[.=10])[1]")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//input[@name='traveller']")).click();
        //Thread.sleep(20000);
        driver.findElement(By.xpath("//button[@id='search_btn_home']")).click();
	}
}
