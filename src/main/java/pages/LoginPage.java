package pages;
//Identify the WebElements using @FindBy--Done
//Write the business logic  --> Method /Operations which we do
//Create object using PageFactory class

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.WebDriverUtils;

public class LoginPage {

	@FindBy(name="username")
	public WebElement usernameTxtBox;
	
	@FindBy(name="password")
	public WebElement pwdtxtBox;
	
	@FindBy(xpath="//button[text()='Sign in']")
	public WebElement signInBtn;
	
	
	public void LoginToApp(String username,String password)
	{
		WebDriverUtils.enterValue(usernameTxtBox, username);
		WebDriverUtils.enterValue(pwdtxtBox, password);
		signInBtn.click();
	}
	
	
	
	
	
}
