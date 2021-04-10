package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;
import Utilities.WebDriverUtils;

public class OrgPage {

	@FindBy(id="Accounts_listView_addRecord")
	public WebElement addOrgBtn;
	
	@FindBy(name="accountname")
	public WebElement orgnameTtBox;
	
	@FindBy(xpath="//button[text()='Save']")
	public WebElement saveBtn;
	/*
	 * Validate the organization namw
	 */
	public boolean validateOrg(String orgName)
	{
		WebElement wb=BaseClass.driver.findElement(By.xpath("//a[text()='"+orgName+"']"));
		boolean flag=wb.isDisplayed();
		return flag;		
	}
	/*
	 * Create organization
	 */
	public void createOrg(String orgName)
	{
		addOrgBtn.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		orgnameTtBox.click();
		WebDriverWait wait=new WebDriverWait(BaseClass.driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(orgnameTtBox)).click();
		//WebDriverUtils.enterValue(orgnameTtBox, orgName);
		orgnameTtBox.sendKeys(orgName);
		saveBtn.click();
	}
	
	
}
