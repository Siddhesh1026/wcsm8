package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchfirefox {
	static WebDriver driver;
	public static void main(String[] args) {
		//To avoid IllegalStatException
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		//To launch FireFox browser
		driver=new FirefoxDriver();
		
	}

}
