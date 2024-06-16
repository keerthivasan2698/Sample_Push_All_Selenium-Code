package TestCases;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.devtools.v125.page.model.Screenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.Home_Page;
import BASEpackage.Baseclass;
import Screenshot.screenshot;
public class Test_Login_page extends Baseclass{
	Home_Page home_page;
@Test(priority=1)
public void LoginTest()
{ 
home_page=logg.login("standard_user","secret_sauce"); 
screenshot.TakeScreenshot(driver,"LoginTest");
String expectdURL="https://www.saucedemo.com/inventory.html"; 
String actualURL=driver.getCurrentUrl(); 
AssertJUnit.assertEquals(actualURL, expectdURL); 
} 
}
