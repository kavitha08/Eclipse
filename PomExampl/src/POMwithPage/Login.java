package POMwithPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {
	
 WebDriver driver;
 
 @CacheLookup
 @FindBy(how=How.LINK_TEXT,using="Sign in") WebElement signin;
 @CacheLookup
 @FindBy(how=How.ID,using="login-username") WebElement Username;
 @CacheLookup
 @FindBy(how=How.ID,using="login-passwd") WebElement Password;
 
 
 
 public Login(WebDriver driver1) {
	 this.driver=driver1;
	 
 }
 
	public void usrpswd(String usernm,String pwd) throws InterruptedException {
		Username.sendKeys(usernm);
		Username.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		Password.sendKeys(pwd);
		Password.sendKeys(Keys.ENTER);
		
		
		
	}
	
	
	
	

}
