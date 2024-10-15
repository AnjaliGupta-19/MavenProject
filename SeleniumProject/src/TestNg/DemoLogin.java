package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoLogin {
	
	WebDriver driver;

    @Test (priority = 0)

     public void setup() {
    	 
    	driver=new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	
    	driver.get("https://automationexercise.com/login");
    	
    	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    	
     }
      @Test (priority = 1)
     public void FullName() {
    	 
    	driver.findElement(By.name("name")).sendKeys("Anjali Gupta");   	 
    	 
     }
     
      @Test (priority = 2)
     public void EnterEmail() {
    	 
    	 driver.findElement(By.xpath("(//input[contains(@name,'email')])[2]")).sendKeys("anjaligupta1914@gmail.com");
     }
     
     
     @Test(priority = 3)
     public void click_On_signup_button() {
    	 
    	 driver.findElement(By.xpath("//button[.='Signup']")).click();
     } 

     @Test(priority = 4)
     public void teardown() {
    	 
    	 //driver.close();
    	 
     }
}
