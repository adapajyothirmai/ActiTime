package actiTimePO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import actiTimelib.Basepage;

public class ActiTimeHomePagePO extends Basepage {

	public ActiTimeHomePagePO(WebDriver driver) {
		super(driver);

	}
	
@FindBy(id="logoutLink")
private WebElement logoutBtn;
public WebElement logoutBtn()
{
	return logoutBtn;
	
}

public void logout()

{
	logoutBtn.click();
}
}
