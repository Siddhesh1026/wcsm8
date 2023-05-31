package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementsMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);

		driver.switchTo().activeElement().sendKeys("biryani");
		Thread.sleep(2000);

		List<WebElement> biryanioptions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
        
		//by using for loop
		//for(int i=1;i<biryanioptions.size();i++)
		//{
			//String biryani = biryanioptions.get(i).getTagName();
			//System.out.println(biryani);
			//Thread.sleep(2000);
		//}
		// By using for each loop
		for (WebElement biryani : biryanioptions) {
			System.out.println(biryani.getText());
			Thread.sleep(2000);
		}
	}

}
