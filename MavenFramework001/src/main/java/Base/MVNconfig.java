package Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import MVLutility.MVNdriverfunction;

public class MVNconfig extends MVNdriverfunction {
	
	
	@Parameters("Browser")
	@BeforeMethod(alwaysRun = true)
	//@Parameters("browser", "chrome")
		
public void setupbrowser(String Browser) {
		
			if(Browser.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver","/Users/jewel/git/MyFramework004/Drivers/chromedriver");
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver");
			driver = new ChromeDriver();
			}
			else if(Browser.equalsIgnoreCase("firefox")) {
				
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver");
				driver = new FirefoxDriver();
			}
		
		
		
		driver.get("http://www.amazon.com");
		pageload();
		maxscreen();
		wttime();
		DltCookies();
		
	}	
	@AfterMethod(alwaysRun = true)
	public void closebrower() {
		driver.close();
	}

}
