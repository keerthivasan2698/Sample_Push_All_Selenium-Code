package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BASEpackage.Baseclass;
public class Home_Page extends Baseclass{
	@FindBy(name="add-to-cart-sauce-labs-backpack")
	WebElement prod1;
	@FindBy(name="add-to-cart-sauce-labs-onesie")
	WebElement prod2;
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a") 
	WebElement cart;
	public Home_Page() 
	{ 
	PageFactory.initElements(driver, this); 
	} 
	public SystemUsersPage add_products() 
	{ 
	prod1.click(); 
	prod2.click(); 
	cart.click(); 
	return new SystemUsersPage(); 
	} 
	}

