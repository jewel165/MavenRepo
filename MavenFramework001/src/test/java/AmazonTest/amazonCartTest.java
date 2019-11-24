package AmazonTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import AmazonLocator.Locators;
import AmazonValues.Values;
import Base.MVNconfig;

public class amazonCartTest  extends MVNconfig{
	

	Locators lv2 = new Locators();
	Values vl02 = new Values();




	@Test(groups = {"Smoke","Regression","Random"})

	public void AddToCart() {
		try {
			driver.findElement(By.xpath(lv2.srcbar)).sendKeys(vl02.iph);
			driver.findElement(By.xpath(lv2.searchbutton)).click();
			driver.findElement(By.xpath(lv2.SrcList)).click();
			driver.findElement(By.id(lv2.AddC)).click();
			driver.findElement(By.id(lv2.AddExt)).click();
			String Confir = 	driver.findElement(By.xpath(lv2.AddConf)).getText();
			String Confirmation = Confir.trim();
			//System.out.println(Confirmation);
			Assert.assertEquals(Confirmation, vl02.CartAddConf);
		}
		catch(Exception e) {
			System.out.println(e);


		}
	}

}
