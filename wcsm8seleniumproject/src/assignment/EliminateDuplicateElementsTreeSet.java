package assignment;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicateElementsTreeSet {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///D:/seleniumdata/HTML/SingleDropdown.html");

		WebElement dropDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDown);
		List<WebElement> alloptions = sel.getOptions();
		// to eliminate the dupliocates and maintain the order of insertion we use
		TreeSet<String> ts = new TreeSet<String>();
		// to read the list by elimintes duplicates....
		for (int i = 0; i < alloptions.size(); i++) {
			// get the options and text of options
			String op = alloptions.get(i).getText();

			// add the text of options to TreeSet
			ts.add(op);
			// to read the options from Treeset
			for (String options : ts) {
				Thread.sleep(2000);
				System.out.println(options);
			}

		}

	}
}
