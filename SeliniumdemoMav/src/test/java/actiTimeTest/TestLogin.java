package actiTimeTest;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import actiTimePO.ActiTimelLoginPO;
import actiTimelib.BaseTest;

public class TestLogin extends BaseTest {
	
	@Test(priority=1)
	public void testValidCredentials()

	{
		try {
			driver.get(TEST_URL);
			ActiTimelLoginPO loginPO = new ActiTimelLoginPO(driver);
			loginPO.login("adapajyothirmai94","SUpY6Epu");
			
	

			String eTitle ="actiTIME - Enter Time-Track";
			loginPO.checkTitle(eTitle);
			String aTitle=driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
		} catch (Exception e) {

			e.printStackTrace();
			Reporter.log("Exception Generated", true);
			Assert.fail();
		}
	}
	
	
	@Test(priority=2)
	public void testInvalidUn()
	{
			try {
				driver.get(TEST_URL);
				ActiTimelLoginPO loginPO = new ActiTimelLoginPO(driver);
				loginPO.login("admin1","SUpY6Epu");
				String eTitle ="actiTIME - Login";
				loginPO.checkWebElement(loginPO.errorMsg());
				boolean aStatus = loginPO.errorMsg().isDisplayed();
				boolean eStatus=true;
				Assert.assertEquals(aStatus, eStatus);
				
			
					loginPO.checkTitle(eTitle);
				String aTitle=driver.getTitle();
				Assert.assertEquals(aTitle, eTitle);
		} catch (Exception e) {

				e.printStackTrace();
				Reporter.log("Exception Generated", true);
				Assert.fail();
			}
			}
	
	@Test(priority=3)
	public void testInvalidPwd()
	{
			try {
				driver.get(TEST_URL);
				ActiTimelLoginPO loginPO = new ActiTimelLoginPO(driver);
				loginPO.login("admin","manager1");
				String eTitle ="actiTIME - Login";
				loginPO.checkWebElement(loginPO.errorMsg());
				boolean aStatus = loginPO.errorMsg().isDisplayed();
				boolean eStatus=true;
				Assert.assertEquals(aStatus, eStatus);
				
			
					loginPO.checkTitle(eTitle);
				String aTitle=driver.getTitle();
				Assert.assertEquals(aTitle, eTitle);
		} catch (Exception e) {

				e.printStackTrace();
				Reporter.log("Exception Generated", true);
				Assert.fail();
			}
		}
	}
		
	
		
	
	
	