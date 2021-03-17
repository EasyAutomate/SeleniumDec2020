package firstCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown {

	@Test
	public void launchBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(500, 500));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//load URL
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		/*
		 * Tag Name is NOT Select 
		 * It is a DD
		 *  1. Click on the DD
		 *  2. Click on that DD option
		 * */
		driver.findElementByXPath("(//button)[1]").click();
		driver.findElementByXPath("//p-dropdown[@formcontrolname=\"prefLang\"]").click();
		String tagName = driver.findElementByXPath("//span[text()='English']").getAttribute("class");
		System.out.println(tagName);
		driver.findElementByXPath("//span[text()='English']").click();
		Thread.sleep(5000);
		driver.quit();

	}

}
