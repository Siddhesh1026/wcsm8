package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ManageMethodAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_1.exe");
     ChromeOptions co = new ChromeOptions();
     co.addArguments("--remote-allow-origins=*");
     WebDriver driver=new ChromeDriver(co);
     //maximize the browser
     driver.manage().window().maximize();
     
     Thread.sleep(2000);
     //set the size of browser
     Dimension targetSize = new Dimension(450, 320);
     driver.manage().window().setSize(targetSize);
     
    Thread.sleep(2000);
    //set the position of browser
    Point targetPosition = new Point(120, 450);
    driver.manage().window().setPosition(targetPosition);
     
     
     
     
     
	}

}
