package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice3Test {
	@Test
	public void prac3() {
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888");
	}


}
