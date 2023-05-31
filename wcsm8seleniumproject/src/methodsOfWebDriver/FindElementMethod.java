package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementMethod {
    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/login.do;jsessionid=3nm9tvawhoa8");
		
		WebElement usernameTB = driver.findElement(By.name("username"));
		usernameTB.sendKeys("admin");
		System.out.println(usernameTB);
		
		WebElement passwordTextBox = driver.findElement(By.name("pwd"));
		passwordTextBox.sendKeys("manager");
		System.out.println(passwordTextBox);
		

	}
}
