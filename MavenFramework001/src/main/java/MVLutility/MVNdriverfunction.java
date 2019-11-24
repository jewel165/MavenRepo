package MVLutility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import AmazonLocator.Locators;
import AmazonValues.Values;



public class MVNdriverfunction {

	public WebDriver driver;
	Locators lc = new Locators();
	Values vl = new Values();



	public String properres;
	//pageload
	public void pageload() {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	public void maxscreen() {
		driver.manage().window().maximize();
	}

	public void wttime() {
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}

	public void DltCookies() {
		driver.manage().deleteAllCookies();			
	}

	//All Clicks
	public void ClickByXpath(String Locator) {
		driver.findElement(By.xpath(Locator)).click();;
	}
	public void clickonaccount() {
		driver.findElement(By.xpath(lc.Account)).click();
	}
	public void clickonsignin()	{
		driver.findElement(By.xpath(lc.Log_cont)).click();
	}

	public void SignInSubmit() {
		driver.findElement(By.xpath(lc.signin)).click();
	}
	public void createaccount() {
		//driver.findElement(By.xpath()).click();

	}

	public void clickonsearch() {
		driver.findElement(By.xpath(lc.searchbutton)).click();
	}
//	all type-in
	public void TypeByXpath(String Locator , String Value) {
		driver.findElement(By.xpath(Locator)).sendKeys(Value);
	}
	
	public void tpiphone() {
		driver.findElement(By.xpath(lc.srcbar)).sendKeys(vl.SearchIph);

	}

	public void TpEmail( ) {
		driver.findElement(By.xpath(lc.Log_email)).sendKeys(vl.eml);
	}

	public void TpPassword() {
		driver.findElement(By.xpath(lc.Log_Pass)).sendKeys(vl.pass01);
	}
//	Search ressult field
	public void srcresult() {
		String result01=	driver.findElement(By.xpath(lc.srcressult)).getText();
		String properres = result01.replaceAll("^\"|\"$", "");
		System.out.println(properres);


	}
	
	//Log-in Varification
	
	public void VerifyLogin() {
		 String HldName = driver.findElement(By.xpath(lc.AccHolder)).getText();
		 System.out.println(HldName);
		 Assert.assertEquals(HldName, vl.AccGreeting);
	}


}
