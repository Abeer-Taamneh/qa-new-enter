package authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github_sinup_screen {

	public static void main(String[] args) throws InterruptedException {
		
	String password="Abeer12345@";
	System.setProperty("webdriver.chrome.driver", "D:\\my new driver\\chromedriver_win32//chromedriver.exe");
    WebDriver driver =new ChromeDriver(); 
    driver.get("http://www.booking.com");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[5]/a")).click();
    
    driver.findElement(By.id("username")).sendKeys("abeertaamneh783@gmail.com");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("new_password")).sendKeys(password);
    driver.findElement(By.id("confirmed_password")).sendKeys(password);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("password")).sendKeys(password);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.id("JkBMLAygdYyLUlJ")).click() ;
    
    
    
    
//    driver.findElement(By.id("email")).sendKeys(emailfacebook);
//    driver.findElement(By.id("pass")).sendKeys("abeerpass");
//    driver.findElement(By.name("login")).click();
//    driver.findElement(By.xpath("//a[normalize-space()='Forgot Password?']")).click();
//   driver.findElement(By.name("reset_action")).click();
//    driver.findElement(By.id("identify_email")).sendKeys("0797833647");
//    driver.findElement(By.id("did_submit")).click();
//    driver.findElement(By.name("reset_action")).click();
//    
    
    
//    driver.manage().window().maximize();
//    driver.findElement(By.className("js-header-login-link")).click();
//   
    
    
//  String MyName="abeer taamneh";
//
// int Number=20;
// double highh=20.8;
//  boolean iloveabeer=true; 
//  System.out.println(MyName+"  "+Number+"   "+highh+"  "+iloveabeer);

	}

}























