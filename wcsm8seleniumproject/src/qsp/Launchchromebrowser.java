package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Launchchromebrowser {
	public static void main(String[] args) throws InterruptedException {
		//To avoid IllegalStatException
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_1.exe");
		//To avoid ConnectionFailedException
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		//To launch Chrome browser
		ChromeDriver driver = new ChromeDriver(co);
		Thread.sleep(4000); //to stop the execution of script for 2 sec
		//To close the chrome browser
		driver.close();
		
		
	}

}
