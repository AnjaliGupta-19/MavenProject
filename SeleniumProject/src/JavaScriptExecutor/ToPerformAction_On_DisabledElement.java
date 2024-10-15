package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import javax.swing.JScrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToPerformAction_On_DisabledElement {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver()	;
		
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/test_cases");
		driver .manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		js.executeScript("window.scrollTo(0,800)");
		
		
	}

}
