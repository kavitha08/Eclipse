package POMwithPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Sendemail {
	WebDriver driver;
	
	
	@CacheLookup
	@FindBy(how=How.LINK_TEXT,using="Compose") WebElement compose;
	@CacheLookup
	@FindBy(how=How.ID,using="message-to-field") WebElement To;
	@CacheLookup
	@FindBy(how=How.XPATH,using="//input[@data-test-id='compose-subject']") WebElement subject;
	@CacheLookup
	@FindBy(how=How.XPATH,using="//div[@data-test-id='rte']") WebElement emailbody;
	
	@CacheLookup
	@FindBy(how=How.XPATH,using="//button[@title='Send this email']") WebElement sendemail;
	
	public Sendemail(WebDriver driver1) {
		this.driver=driver1;
	}
	
	
	public void ComposeEmail(String toemail,String subjt,String emlbody) {
		compose.click();
		To.sendKeys(toemail);
		subject.sendKeys(subjt);
		emailbody.sendKeys(emlbody);
		sendemail.click();
		
		
	}

}
