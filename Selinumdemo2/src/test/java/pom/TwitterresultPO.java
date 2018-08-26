package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libray.BasePage;

public class TwitterresultPO extends BasePage {

	public TwitterresultPO(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="//a")
private List<WebElement> allLinks;
public  int allLinksSize(){
	return allLinks.size();
	
}
@FindBy(xpath="//a[text()='Login on Twitter']")
private WebElement twitterlink;
public WebElement twitterlink(){
	return twitterlink;
	
}
}
