package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libray.BasePage;

public class FacebookResultPO extends BasePage {

	public FacebookResultPO(WebDriver driver) {
		super(driver);
		
	}

	/*	@FindBy(xpath="//a")

	private List<WebElement> allLinks;
		public int allLinksize()
		{
			return allLinks.size();
			
		}
	public WebElement getAllLink(int i){
		return allLinks.get(i);
		
	}*/
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	public int allLinksSize() {
		return allLinks.size();
	}
	
	
@FindBy(xpath="//a[text()='Facebook - Log In or Sign Up']")
private WebElement facebooklink;
public WebElement facebooklink(){
	return facebooklink;
}
/*public void facebooktest(){
	facebooklink.click();
}*/
}


	



