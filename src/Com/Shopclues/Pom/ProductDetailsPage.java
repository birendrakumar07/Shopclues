package Com.Shopclues.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import Com.Shopclues.Generics.BasePage;

public class ProductDetailsPage extends BasePage {
	private WebDriver driver;
	@FindBy(xpath="//a[@class='cart_ic']")
	private WebElement veryfycartadd;
	
	@FindBy(xpath="//a[.='View Cart']")
	private WebElement vcart;
	
	@FindBy(xpath="//a[.(.,'Dell Vostro 3568 15.6')]")
	private WebElement verifyProduct;
	
	public ProductDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	public void veryfycartAdd(){
		
		veryfycartadd.click();
	}
	public void clickOnviewCart() {
		vcart.click();
	}
	public void veryfyProduct(){
	WebDriverWait wait=new WebDriverWait(driver,eto);
	try{
		wait.until(ExpectedConditions.visibilityOf(verifyProduct));
		Reporter.log("Product is added to the Cart successfully");
	}
	catch(Exception e){
		Reporter.log("Fail : Product is not Displayed");
	}
	}
}
