package Com.Shopclues.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Shopclues.Generics.BasePage;

public class LenovoPage extends BasePage{
public WebDriver driver;
 @FindBy(xpath="//a[.='More Specification']")
 private WebElement LenovoSpec;
 public LenovoPage(WebDriver driver) {
	 PageFactory.initElements(driver,this);
 }
 public void LenovoSpeClk() {
	 LenovoSpec.clear();
 }
}
