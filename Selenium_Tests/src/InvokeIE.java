import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InvokeIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", 
				"C:\\Users\\Janielle Gregorio\\git\\Selenium_Tests\\Selenium_Tests\\Web Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());	
		
		
	}

}

