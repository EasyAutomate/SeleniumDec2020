package firstCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptDropDown {

	@Test
	public void launchBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//load URL
		driver.get("https://www.goglobalwithtwitter.com/en/form/contact-us");
		/*
		 * Select Class
		 *  1. Index --> Order / Always the given option 
		 *  2. Value --> Preferred Option --> Localization
		 *  3. Visible Text --> Visible portion of Text
		 *  4. SendKeys --> ! Select class --> Preferred when we have huge text for visible text
		 * */
		
		Select agencyDd= new Select(driver.findElementByName("agency_team"));
		agencyDd.selectByIndex(2);
		Thread.sleep(3000);
		agencyDd.selectByValue("1");
		Thread.sleep(3000);
		agencyDd.selectByVisibleText("Select");;
		Thread.sleep(3000);
		driver.findElementByName("agency_team").sendKeys("Y");
		Thread.sleep(3000);
		driver.quit();

	}

}
