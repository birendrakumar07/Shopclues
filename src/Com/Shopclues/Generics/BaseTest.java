package Com.Shopclues.Generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest  implements IAutoConstant {
	public WebDriver driver;
	static{
	System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
@BeforeMethod
public void OpenApplication(){
	ChromeOptions option = new ChromeOptions();
	option.addArguments("---disable-notifications");
	driver=new ChromeDriver(option);
	String url=Lib.getProperty(CONFIG_PATH, "URL");
	driver.get(url);
	String ito = Lib.getProperty(CONFIG_PATH, "ITO");
	long it = (long)Integer.parseInt(ito);
    driver.manage().timeouts().implicitlyWait(it, TimeUnit.SECONDS);
	
}
//@AfterMethod
//public void closeApplication(){
////	driver.close();
//}
}
