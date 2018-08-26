package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libray.BasePage;

public class LinkedinPO extends BasePage {

	public LinkedinPO(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	public  int allLinksSize(){
		return allLinks.size();
		
	}
@FindBy(xpath="//a[text()='LinkedIn: Log In or Sign Up']")
private WebElement linkedinlink;
public WebElement linkedinlink(){
	return linkedinlink;
	
}
}
