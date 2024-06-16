package BASEpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.Login_page;
public class Baseclass {
	public static WebDriver driver;
	public Login_page logg;
	@BeforeMethod
	public void setup() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	logg=new Login_page();
	}
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}}
