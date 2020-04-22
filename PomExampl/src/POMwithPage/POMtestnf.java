package POMwithPage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;

public class POMtestnf {

	WebDriver driver;
	@Test
	public void f() throws InterruptedException {

		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);

		Login lgn=PageFactory.initElements(driver, Login.class);
		lgn.usrpswd("annekavi@yahoo.com","Mosam08$");
	}

	@Test
	public void sendemail() {
		
		Sendemail sndeml=PageFactory.initElements(driver, Sendemail.class);
		sndeml.ComposeEmail("Kavithaancha@gmail.com", "say hello", "Hi how are you");
	}




	@BeforeSuite
	public void beforeSuite() {

		String currDir=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver",currDir+"/Drivers/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://login.yahoo.com/?.src=ym&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void afterSuite() {
	}

}
