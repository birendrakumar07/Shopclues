package Com.Shopclues.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import Com.Shopclues.Generics.BasePage;



public class AddToCartPage extends BasePage {
	private WebDriver driver;
	@FindBy(id="add_cart")
	private WebElement addcrt;
	
    @FindBy(xpath="//h1[@itemprop='name']")
    private WebElement vdetails;
   
    
    @FindBy(xpath="//*[@id='scrolltospecs']")
    private WebElement morespec;

	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void add_Cart() {
		verifyElement(driver, eto,addcrt);
		addcrt.click();
	}
	public void  clickmoreSpec(){
		verifyElement(driver,eto, morespec);
		morespec.click();
		Reporter.log("Specation is displaying");
	}
}
