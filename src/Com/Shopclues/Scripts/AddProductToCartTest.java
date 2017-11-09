package Com.Shopclues.Scripts;

import org.testng.annotations.Test;

import Com.Shopclues.Generics.BaseTest;
import Com.Shopclues.Pom.AddToCartPage;
import Com.Shopclues.Pom.HomePage;
import Com.Shopclues.Pom.LaptopPage;
import Com.Shopclues.Pom.ProductDetailsPage;

public class AddProductToCartTest extends BaseTest {
@Test(priority=1)
public void addProductToCart(){
	HomePage hp=new HomePage(driver);
	hp.mouseHoverOnElectronics();
	hp.clickOnLaptop();
	LaptopPage lp=new LaptopPage(driver);
	lp.SelectDelllaptop();
	lp.clickOnDellProduct();
	AddToCartPage adcart = new AddToCartPage(driver);
	adcart.add_Cart();
	ProductDetailsPage pdetails = new ProductDetailsPage(driver);
	pdetails.clickOnviewCart();
	pdetails.veryfycartAdd();
	pdetails.veryfyProduct();
	
}
}
