package WebElement;

import java.awt.event.KeyEvent;

import org.bouncycastle.cms.bc.BcEdDSASignerInfoVerifierBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		 
		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");
		
        WebElement searchbox = driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]"));
        
        searchbox.sendKeys("kids");
        
        Thread.sleep(4000);
        searchbox.sendKeys(Keys.ENTER);
        

        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='Bag']")).click();
	}
}