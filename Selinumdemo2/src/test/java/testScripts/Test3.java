package testScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import libray.BaseTest;
import pom.GooglePagePO;
import pom.TwitterresultPO;

public class Test3 extends BaseTest {
	@Test
public void twittertest(){
		try {
			GooglePagePO po3=new GooglePagePO(driver);
			po3.googleSrch("twitter");
			TwitterresultPO po4=new TwitterresultPO(driver);
			Reporter.log("total no of links" +   po4.allLinksSize(),true);
			po4.twitterlink().click();
			String eTitle = "Login on Twitter";
			po4.checkTitle(eTitle);
			String aTitle=driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
		} catch (Exception e) {
			
			e.printStackTrace();
	Assert.fail();
		}
			
		}
	}

