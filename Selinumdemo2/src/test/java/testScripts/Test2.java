package testScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import libray.BaseTest;
import pom.GooglePagePO;
import pom.InstagramresultPO;

public class Test2 extends BaseTest{
	@Test
	public void instagramtest(){
		try {
			GooglePagePO po=new GooglePagePO(driver);
			po.googleSrch("instagram");
			InstagramresultPO po2= new InstagramresultPO(driver);
			Reporter.log("total no links"+ po2.allLinksize(),true);
			//System.out.println(driver.getTitle());
po2.instagramlink().click();
			String eTitle = "Instagram";
			po2.checkTitle(eTitle);
			String aTitle=driver.getTitle();
			Assert.assertEquals(aTitle,eTitle);
		} catch (Exception e) {
		
			e.printStackTrace();
		Reporter.log("Expection generated",true);
		Assert.fail();		
		}
		
		
		
	}
	
}
