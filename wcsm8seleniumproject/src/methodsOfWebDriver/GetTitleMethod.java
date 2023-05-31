package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTitleMethod {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_1.exe");
    ChromeOptions co = new ChromeOptions();
    co.addArguments("--remote-allow-origins=*");
    WebDriver driver=new ChromeDriver(co);
    driver.get("https://www.instagram.com/");
    String loginPageTitle=driver.getTitle();
    System.out.println(loginPageTitle);
    driver.manage().window().maximize();
    
    
    
    
	}

}
