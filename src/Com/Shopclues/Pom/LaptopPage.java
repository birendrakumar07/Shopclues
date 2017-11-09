package Com.Shopclues.Pom;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.Shopclues.Generics.BasePage;

public class LaptopPage extends BasePage {
   private WebDriver driver;
//   WebDriverWait wait=new WebDriverWait(driver,10);
	@FindBy(xpath="//label[@for='Dell']")
	private WebElement SelectDell;
	@FindBy(xpath="//input[@id='autocomplete']")
	private WebElement ProdSearch;
	 @FindBy(xpath="//a[@onclick='searchTrigger()']")
	 private WebElement clksearch;
	@FindBy(xpath="//img[@id='det_img_118501107']/../..")
	private WebElement dellproduct;
	
	
	public LaptopPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver= driver;
		
	}
	public void SelectDelllaptop(){
		
		verifyElement(driver, eto, SelectDell);
		SelectDell.click();
	}
	public void entertSearchProduct(){
		verifyElement(driver, eto, ProdSearch);
		ProdSearch.sendKeys("DELL INSPIRON 5566");
	}
	public void clickSearchButton(){
		verifyElement(driver, eto, clksearch);
		clksearch.click();
	}
	
	public void clickOnDellProduct(){
		verifyElement(driver, eto, dellproduct);
		dellproduct.click();
		ArrayList<String>lst1=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(lst1.get(2));
	}
	
}
