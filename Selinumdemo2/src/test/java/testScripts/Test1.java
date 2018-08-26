package testScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import libray.BaseTest;
import pom.FacebookResultPO;
import pom.GooglePagePO;

public class Test1 extends BaseTest{
	
	@Test
	public void facebookTest() {
		try {
			GooglePagePO googlePO=new GooglePagePO(driver);
			googlePO.googleSrch("facebook");
			FacebookResultPO fbGoPO=new FacebookResultPO(driver);
			Reporter.log("Total no. of Links = "+fbGoPO.allLinksSize(),true);
			fbGoPO.facebooklink().click();
               String eTitle="Facebook – log in or sign up";
			fbGoPO.checkTitle(eTitle);
			String aTitle = driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
		} catch (Exception e) {			
			e.printStackTrace();
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
	}

}

//@org.testng.annotations.Test
//public void Facebook(){
	//FacebookResultPO fPo=new FacebookResultPO(driver);
	 //fPo.allLinksize();
	//System.out.println(count);
	//Reporter.log("TOTAL NUM OF LINKS"+ fPo.allLinksSize(),true);	
	//fPo.facebooklink().click();
	
	


