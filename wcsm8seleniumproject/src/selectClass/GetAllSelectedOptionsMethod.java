package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("file:///D:/seleniumdata/HTML/SingleDropdown.html");

		WebElement dropDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDown);
		// how to select multiple options
		for (int i = 0; i < 6; i++) {
			sel.selectByIndex(i);

		}
		List<WebElement> alloptions = sel.getAllSelectedOptions();
		for (WebElement op : alloptions) {
			String options = op.getText();
			System.out.println(options);
		}
	}
}
