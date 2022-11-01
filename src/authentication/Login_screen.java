package authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_screen {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\my new driver\\chromedriver_win32//chromedriver.exe");
	    WebDriver driver =new ChromeDriver(); 
	    //window.scrollBy(0,900) بتنزل الموقع لتحت
	    driver.manage().window().maximize();
	    driver.get("http://www.booking.com");
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,200)");
	    Thread.sleep(3000);
	    driver.findElement(By.id("ss")).sendKeys("amman");
	    driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span")).click();
	    driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[5]/td[6]")).click();
	   
	
	    
	   // driver.findElement(By.xpath("//button[@class='sb-searchbox__button ']")).click();
	}

}












