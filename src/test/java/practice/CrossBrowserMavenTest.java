package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class CrossBrowserMavenTest {
	//pull back@priyanka 
	 WebDriver driver= null;
	
	public void launch() {
		String BROWSER= System.getProperty("browser");
		String URL= System.getProperty("url");
		
		if(BROWSER.equalsIgnoreCase("Chrome")) {
			driver= new ChromeDriver();
		}
		
		else if(BROWSER.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}
		
		else {
			driver= new ChromeDriver();
		}

		driver.get(URL);
		
	}

}
