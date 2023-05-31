package synchronization;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActiTime {
    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//ChromeOptions co = new ChromeOptions();
		//co.addArguments("--remote-allow-origins");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://laptop-7de8ii5v/login.do");
		String actualloginpagegeTitle = driver.getTitle();
		
		if (actualloginpagegeTitle.equals("actiTIME - Login")) {
			
			System.out.println("Login page title is match: Test case is pass");
			
		} else {

			System.out.println("Login page title is not match: Test case is fail");
		}
		driver.findElement(By.name("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.xpath("//a[.='Login']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String actualloginhomegeTitle = driver.getTitle();
		if (actualloginhomegeTitle.equals("actiTIME - Enter Time-Track")) {
			
			System.out.println("Home page title is match: Test case is pass");
			
		} else {
			
			System.out.println("home page title is not match: Test case is fail");

		}
			
	}
}
