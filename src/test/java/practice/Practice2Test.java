package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice2Test {
	@Test
	public void prac() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://facebook.com");
	}

}
