package TestCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import BASEpackage.Baseclass;
import Pages.Home_Page;
public class Test_Home_Page extends Baseclass 
{ 
Home_Page home_page; 
@Test(priority=2) 
public void AddProducts() throws InterruptedException 
{ 
home_page=logg.login("standard_user","secret_sauce"); 
home_page.add_products(); 
Thread.sleep(2000); 
String expectdURL="https://www.saucedemo.com/cart.html"; 
String actualURL=driver.getCurrentUrl(); 
Assert.assertEquals(actualURL, expectdURL); 
} 
}
