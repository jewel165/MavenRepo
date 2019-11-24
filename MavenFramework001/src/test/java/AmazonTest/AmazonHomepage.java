package AmazonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import AmazonLocator.Locators;
import AmazonValues.Values;
import Base.MVNconfig;
import MVLutility.MVNdriverfunction;

public class AmazonHomepage extends MVNconfig  {

	public static final char[] Exception = null;

	public class AmazonHmPage  {

		MVNdriverfunction dd = new MVNdriverfunction();
		Locators al = new Locators();
		Values vl = new Values();	


		@Test(groups = {"Smoke","Regression","Random"})
		public void AzHomepage() {
			try {
			String url=	driver.getCurrentUrl();
			System.out.println(url);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}



		@Test(groups = {"Random"})
		public void tittle() {
			try {
			String acttittle = 	driver.getTitle();
			System.out.println(acttittle);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

		@Test(groups = {"Smoke","Regression"})
		public void AzLogin() {
			try {
				clickonaccount();
				TpEmail();
				// String aaa =  driver.findElement(By.xpath(al.Log_email)).getText();
				// System.out.println(aaa);
				//clickonsignin();
				clickonsignin();
				TpPassword();
				SignInSubmit();
				VerifyLogin();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}


		@Test(groups = {"Random"})
		public void demo() {
			System.out.println("Hello eberybody");

		}

		@Test(groups = {"Random"})
		public void demo2() {
			System.out.println("Hello eberybody");

		}

		@Test(groups = {"Random"})
		public void demo3() {
			System.out.println("Hello eberybody");

		}

		@Test(groups = {"Random"})
		public void demo4() {
			System.out.println("Hello eberybody");

		}

		@Test(groups = {"Random"})
		public void amazonlogoTest() {
			try {	
				WebElement abc=	driver.findElement(By.xpath(al.azlogo));
				boolean cbd =abc.isDisplayed();
				Assert.assertEquals(cbd, true);
				System.out.println("Amazon logo is displayed");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}

			//// this is a test/////////





		}
	}
}
