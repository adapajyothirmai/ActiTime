package testScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import libray.BaseTest;
import pom.GooglePagePO;
import pom.LinkedinPO;

public class Test4 extends BaseTest {
	@Test
	public void linkedin(){
		try {
			GooglePagePO po4=new GooglePagePO(driver);
			po4.googleSrch("linkedin");
LinkedinPO po5=new LinkedinPO(driver);
Reporter.log("Total no links"+ po5.allLinksSize(),true);
po5.linkedinlink().click();
String eTitle="LinkedIn: Log In or Sign Up";
po5.checkTitle(eTitle);
String aTitle=driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		Assert.fail();
		}
		
	
	}
	

}
