package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(id="menu")
	public WebElement menuBtn;
	@FindBy(xpath="//span[text()='Organizations']")
	public WebElement orgLink;
	@FindBy(xpath="//img[contains(@src,'logo.png')]")
	public WebElement logoIcon;
	@FindBy(xpath="//div[text()='Logout']")
	public WebElement logoutBtn;
	@FindBy(xpath="//span[text()='Contacts']")
	public WebElement contactsLink;
	public void logoutFromApp()
	{
		logoIcon.click();
		logoutBtn.click();
	}
	public void clickOnOrg()
	{
		menuBtn.click();
		orgLink.click();
	}
	public void clickContacts()
	{
		menuBtn.click();
		contactsLink.click();
	}
}
