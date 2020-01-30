import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_FB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Janielle Gregorio\\git\\Selenium_Tests\\Selenium_Tests\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("JanielleJoyGregorio");
		driver.findElement(By.name("pass")).sendKeys("987654321");
		driver.findElement(By.linkText("Forgot account?")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
