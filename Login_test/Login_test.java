package Login_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rigve\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("Haritha");
	}

}

// Tested in eclipse ide and works
