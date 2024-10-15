package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToVisibleArea {

	public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/test_cases");
		driver .manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		WebElement test6 = driver.findElement(By.xpath("//u[contains(.,'Test Case 6: Contact Us Form')]"));
		
		js.executeScript("argument[0].scrollIntoview(false)",test6);
		
		
		
		
		
		
		
		
	}

}
