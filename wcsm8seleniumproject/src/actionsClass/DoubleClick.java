package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleClick {
    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://laptop-7de8ii5v/login.do");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("formCustomInterfaceLogo.logoOption")).click();
	}
}
