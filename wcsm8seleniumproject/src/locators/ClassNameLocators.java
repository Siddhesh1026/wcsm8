package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassNameLocators {
          public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_1.exe");
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.get("https://www.google.co.in/");
			driver.switchTo().activeElement().sendKeys("Phoebe Buffay",Keys.ENTER);
			driver.findElement(By.className("lNPNe")).click();
		}
}
