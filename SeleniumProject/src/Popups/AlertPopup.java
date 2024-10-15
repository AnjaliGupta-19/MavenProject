package Popups;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTSignatureSpi.withSha256;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.LongPolynomial2;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ActionClass.ClickandHold;

public class AlertPopup {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
       
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		 driver.get("https://demo.automationtesting.in/Alerts.html");
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		
		
		driver.findElement(By.xpath("(//button[contains(text(),'click the button to d')])[1]")). click();
		
				//Alert with ok button
		Alert al = driver.switchTo().alert();
		 
		 Thread.sleep(4000);
		 al.accept();
		 
		 //Alert with cancel button
		 
		 
		 driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		 
		 Thread.sleep(4000);
		  
		 driver.findElement(By.xpath("(//button[(text()='click the button to display a confirm box ')])")). click();
		  Thread.sleep(4000);
		  
		  Alert al2 = driver.switchTo().alert();
		  Thread.sleep(4000);
		  //al2.dismiss();
		  al2.accept();
		 
		  
		 
		 
		 
		 
		 
	}

}
