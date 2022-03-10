package sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb {

	@Test
	public void nm() {
		WebDriverManager.chromedriver().setup();
	WebDriver	driver=new ChromeDriver();
	driver.get("https://mvnrepository.com/");
	driver.manage().window().maximize();
	}
}
