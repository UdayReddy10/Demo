package Utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;
import pages.LoginPage;


public class BaseClass {
	public static WebDriver driver;
	
	DataReader data=new DataReader();
	
@BeforeClass
public void launchBrowser() throws Exception
{
	String browser=data.getPropertyData("browser");
	
	if(browser.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+data.getPropertyData("chromepath"));
		driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+data.getPropertyData("geckopath"));
		driver=new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("Ie"))
	{
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+data.getPropertyData("iepath"));
		driver=new InternetExplorerDriver();
	}
	String url=data.getPropertyData("url");
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
@BeforeMethod
public void login() throws IOException
{
	String username=data.getPropertyData("username");
	String password=data.getPropertyData("password");
	//Create object for page Class
	LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
	lp.LoginToApp(username, password);
}
@AfterMethod
public void logout()
{
	HomePage hp=PageFactory.initElements(driver, HomePage.class);
	hp.logoutFromApp();
}
@AfterClass
public void tearDown()
{
	driver.quit();
}
}
