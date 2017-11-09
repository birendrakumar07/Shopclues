package Com.Shopclues.Scripts;

import org.testng.annotations.Test;

import Com.Shopclues.Generics.BaseTest;
import Com.Shopclues.Pom.HomePage;
import Com.Shopclues.Pom.LaptopPage;

public class HomeTest extends BaseTest{
	@Test(priority=2)
	public void homeTest(){
	HomePage hp=new HomePage(driver);
	hp.mouseHoverOnElectronics();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	hp.clickOnLaptop();
	}

}
