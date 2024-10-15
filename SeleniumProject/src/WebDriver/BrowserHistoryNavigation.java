package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserHistoryNavigation {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new EdgeDriver();
		
		 driver.get("https://www.flipkart.com/");
		   
		 Navigation nav= driver. navigate();
		 
		 
          Thread.sleep(4000);	
          nav.back();
          Thread.sleep(4000);
         nav.forward();
          Thread.sleep(4000);
          nav.refresh();
          
          Window win= driver.manage().window();
          
      
          win.maximize();
          
         win.fullscreen();
          
          //to fetch the size of the window
          
           Dimension size = win.getSize();
           System.out.println(size);
            
            System.out.println("The height of the window is : " +size.getHeight());
            System.out.println("The width of the window is : " + size.getWidth());
            
          //to set the size of the window
            win.setSize(new Dimension(500,400));
          
            // to fetch the position of the window
            win.getPosition();
            
           Point pos = win.getPosition();
            System.out.println( pos);
            
          System.out.println("The position of X is : " + pos.getX());
          System.out.println("the position of Y is :" + pos.getY());
            
            //to set the position of the window
            win.setPosition(new Point(600, 400));
           
            nav.to("https://www.amazon.in/s?k=amazon+prime&adgrpid=1322714101714665&hvadid=82669897711050&hvbmt=bb&hvdev=c&hvlocphy=158337&hvnetw=o&hvqmt=b&hvtargid=kwd-82670518517893%3Aloc-90&hydadcr=5621_2377279&msclkid=62383f1eaedf1c29d7c659db063e1411&tag=msndeskstdin-21&ref=pd_sl_f6wf1fn58_b");
    
            driver.quit();
}	      
	
	
	
}
