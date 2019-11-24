package AmazonTest;

import org.testng.annotations.Test;

import AmazonLocator.Signinpage;
import AmazonValues.amazonSignIN;
import Base.MVNconfig;

public class AmazonSignin extends MVNconfig {
	
	Signinpage lc3 = new Signinpage();
	amazonSignIN vl3 =  new amazonSignIN();
	
	@Test(groups= {"Smoke"})
	public void azSignIn() {
		ClickByXpath(lc3.Accountlist);
		TypeByXpath(lc3.emailfield,vl3.emailADD);
		
		// will not add the password for now.jkjfjgkjkhjk
		
	}

}
