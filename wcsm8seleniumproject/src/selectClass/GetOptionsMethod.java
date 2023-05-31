package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("file:///D:/seleniumdata/HTML/MultipleDropdown.html");

		WebElement dropDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDown);
		List<WebElement> alloptions = sel.getOptions();
		// to read the list of webelment use looping statements
		// for loop

		for (int i = 0; i < alloptions.size(); i++) {

			String option = alloptions.get(i).getText();
			System.out.println(option);

		}
//		// advance for loop
//		for (WebElement op : alloptions) {
//			String options = op.getText();
//			System.out.println(options);
		}
	}

