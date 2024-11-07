package testcases;

import java.util.concurrent.TimeUnit;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.deser.std.StackTraceElementDeserializer.Adapter;
import library.Browser;
import pages.HomePage;
import pages.LoginPage;

public class LoginTestRunner {
	static WebDriver driver;

	HomePage home;
	
	LoginPage loginPage;
	
	Browser browser;
	
	@Test
	public void testexecution() throws InterruptedException {
		
		/*driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);*/
		
		browser= new Browser();
		loginPage= new LoginPage(driver);
		home=new HomePage(driver);
		
		
		browser.setup();
		loginPage.logintoapp("Admin","admin123");
		
		Thread.sleep(4000);
	    home.logoutapp();
	
	}
	@AfterClass
	public void teardown() {
		  
     driver.close();
     driver. quit();
		
	}
	
	
}
