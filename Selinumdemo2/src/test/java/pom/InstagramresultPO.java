package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libray.BasePage;

public class InstagramresultPO extends BasePage {

	public InstagramresultPO(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(xpath="//a")
	private List<WebElement>allLinks;
	public int allLinksize(){
		return allLinks.size();
		
	}
	
@FindBy(xpath="//a[text()='Instagram']")
private WebElement instagramlink;
public WebElement instagramlink(){
	return instagramlink;
	
}

}
