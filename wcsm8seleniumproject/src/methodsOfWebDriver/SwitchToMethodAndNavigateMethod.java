package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToMethodAndNavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
   
   WebDriver driver=new FirefoxDriver();
   driver.manage().window().maximize();
   //will launch web application by using navigate method
   driver.navigate().to("https://www.google.com/");
   Thread.sleep(2000);
   //switch the control to activeElement
   //driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
   //driver.navigate().back();
   Thread.sleep(2000);
   driver.switchTo().activeElement().sendKeys("Automation Testing",Keys.ENTER);
   //use forward operation
   driver.navigate().forward();
   //use refresh operation
   driver.navigate().refresh();
   Thread.sleep(2000); 
   driver.quit();
   
   

	}

}
