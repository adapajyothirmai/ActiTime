package actiTimeTest;

import org.testng.annotations.Test;

import actiTimePO.ActiTimeHomePagePO;
import actiTimePO.ActiTimelLoginPO;
import actiTimelib.BaseTest;

public class ActiTimeHomeTest extends BaseTest {
	
	@Test
	public void testLogout()
	{
		driver.get(TEST_URL);
		ActiTimelLoginPO loginPO = new ActiTimelLoginPO(driver);
		loginPO.login("admin1","manager");
		ActiTimeHomePagePO homePagePO = new ActiTimeHomePagePO(driver);
		homePagePO.checkWebElement(homePagePO.logoutBtn());
		homePagePO.logout();
	}

}
