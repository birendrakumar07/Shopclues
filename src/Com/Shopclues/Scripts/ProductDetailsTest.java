package Com.Shopclues.Scripts;

import org.testng.annotations.Test;

import Com.Shopclues.Generics.BaseTest;
import Com.Shopclues.Pom.AddToCartPage;
import Com.Shopclues.Pom.HomePage;
import Com.Shopclues.Pom.LaptopPage;

public class ProductDetailsTest extends BaseTest{
	@Test(priority=4)
public void chekProductDetails(){
	HomePage h=new HomePage(driver);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	h.mouseHoverOnElectronics();
	h.clickOnLaptop();
	LaptopPage l = new LaptopPage(driver);
	l.SelectDelllaptop();
	l.clickOnDellProduct();
	AddToCartPage acp = new AddToCartPage(driver);
    acp.clickmoreSpec();
}
}

