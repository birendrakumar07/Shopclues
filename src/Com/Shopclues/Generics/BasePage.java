package Com.Shopclues.Generics;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;




public class BasePage implements IAutoConstant{
	//WebDriver driver;
	String ito = Lib.getProperty(CONFIG_PATH, "ETO");
	public long eto = Integer.parseInt(ito);
    
		public void verifyElement(WebDriver driver,long time,WebElement element ){
			
			try{
				WebDriverWait wait=new WebDriverWait(driver,eto);
				wait.until(ExpectedConditions.visibilityOf(element));
				Reporter.log("Element is present",true);
			}
			catch(Exception e){
				Reporter.log("Element is not displayed",true);
				Assert.fail();
			}
		}
		
	}

