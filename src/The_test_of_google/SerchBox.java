package The_test_of_google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SerchBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\my new driver\\chromedriver_win32//chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://www.google.com");
	    driver.findElement(By.name("q")).sendKeys("jordan");

	}

}
