package pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	 WebDriver driver;
	
	@FindBy(xpath="//span[@class=\"oxd-userdropdown-tab\"]")
	private WebElement profile;
	
	@FindBy(linkText = "Logout")
	private WebElement logout;

    
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	 public void profiledrop() {
    	
    	profile.click();
    }

    public void logout() {
	
	logout.click();
}
   public void logoutapp() {
	   
	   this.profiledrop();
	   this.logout();
	   
	   
   }
    
    
    
    
}