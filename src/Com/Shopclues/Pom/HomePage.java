package Com.Shopclues.Pom;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import Com.Shopclues.Generics.BasePage;

public class HomePage extends BasePage {
	private WebDriver driver;
	
   //To SignIn { 
	@FindBy(xpath="//a[text()='Sign In']")
	private WebElement signIn;
	@FindBy(xpath="(//input[@name='user_login'])[1]")
	private WebElement UserId;
	@FindBy(xpath="(//input[@name='password'])[1]")
	private WebElement UPass;
	@FindBy(xpath="//a[text()='Login']")
	private WebElement Login;

  // }
	
	@FindBy(xpath="//a[.='Electronics']")
	private WebElement Electronics;
	
	@FindBy(xpath="(//li/a[@href='javascript:void(0);'])[3]")
	private WebElement VeryfyLgn;
	
	
	
	@FindBy(xpath="//strong[.='Laptops']")
	private WebElement laptop;
	// To Verify product {
	@FindBy(xpath="//a[@class='cart_ic']")
	private WebElement veryfycartadd;
	
	@FindBy(xpath="//a[.='View Cart']")
	private WebElement vcart;
	
	@FindBy(xpath="//a[contains(.,'Dell Vostro 3568 15.6')]")
	private WebElement verifyProduct;
	//}
	

public HomePage(WebDriver driver){
	PageFactory.initElements(driver, this);
	this.driver=driver;
}
  //SignIn }
public void clickSignIn() {
	
signIn.click();	
}
public void SetUserId(String UId) {
	UserId.sendKeys(UId);
}
public void SetPassword(String UserPass) {
	UPass.sendKeys(UserPass);
}
public void clickLogin() {
	Login.click();
}
  // }

public void mousehoverOnVCart() {
	Actions actions=new Actions(driver);
	actions.moveToElement(veryfycartadd).perform();
}
public void mouseHoverOnElectronics() {
	Actions actions=new Actions(driver);
	actions.moveToElement(Electronics).perform();
}
public void clickOnLaptop() {
	verifyElement(driver, eto, laptop);
	
		laptop.click();
		ArrayList<String>lst=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(lst.get(1));
}

public void clickOnviewCart() {
	verifyElement(driver,eto,vcart);
	vcart.click();
}
public void VerifyProduct() {
	Assert.assertTrue(verifyProduct.isDisplayed());
}
public void VeryfyLogin(String vlgn) {
	
	try{
		Assert.assertTrue(VeryfyLgn.isDisplayed());
		String atext = VeryfyLgn.getText();
		 
		 //SoftAssert asrt=new SoftAssert();
		 Assert.assertEquals(atext, vlgn);
		 Reporter.log("Successfully Loged In",true);	
	}
	catch (AssertionError e) {
	System.out.println("Assertion not working");
		
	}
	
	}

}
