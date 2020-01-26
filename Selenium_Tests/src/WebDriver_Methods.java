import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Janielle Gregorio\\git\\Selenium_Tests\\Selenium_Tests\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		// Validate if current URL is correct
		System.out.println(driver.getCurrentUrl());
		
		// Validate the page source when right-click is disabled.
		// System.out.println(driver.getPageSource());
		
		driver.get("https://www.msn.com/en-ph/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		driver.quit();
	}

}
