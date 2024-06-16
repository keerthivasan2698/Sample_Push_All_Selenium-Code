package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import BASEpackage.Baseclass;
public class Login_page extends Baseclass{
@FindBy(id="user-name")
WebElement Uname;
@FindBy(id="password")
WebElement pwd;
@FindBy(id="login-button")
WebElement login;
public Login_page()
{
	PageFactory.initElements(driver,this);

}
public Home_Page login(String username, String password) 
{ 
Uname.sendKeys(username); 
pwd.sendKeys(password); 
login.click(); 
return new Home_Page(); 
} 
}

