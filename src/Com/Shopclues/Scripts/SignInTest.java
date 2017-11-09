package Com.Shopclues.Scripts;

import org.testng.annotations.Test;

import Com.Shopclues.Generics.BaseTest;
import Com.Shopclues.Generics.Lib;
import Com.Shopclues.Pom.HomePage;

public class SignInTest extends BaseTest{
	@Test(priority=1)
	public void SignIn() {
		 int rc=Lib.getRowCount(XLPATH, "LoginCred");
		 for(int i=1;i<=rc;i++){
			 String un = Lib.getCellValue(XLPATH, "LoginCred",i, 0);
			String pw = Lib.getCellValue(XLPATH, "LoginCred", 1, 1);
		HomePage hp=new HomePage(driver);
		hp.clickSignIn();
		hp.SetUserId(un);
		hp.SetPassword(pw);
		hp.clickLogin();
		hp.VeryfyLogin("Hi birendra");
		 }
	 }
}
