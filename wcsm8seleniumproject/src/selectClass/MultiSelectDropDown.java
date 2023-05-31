package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("file:///D:/seleniumdata/HTML/MultipleDropdown.html");

		WebElement dropdown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropdown);

		for (int i = 0; i < 6; i++) {
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}

	}

}
