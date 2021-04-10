package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.DataReader;
import pages.HomePage;
import pages.OrgPage;
@Listeners(Utilities.Screenshots.class)
public class RegTest extends BaseClass {

	DataReader data=new DataReader();
	@Test
	public void createOrganizations() throws EncryptedDocumentException, IOException
	{
		String orgName=data.readExcelData("Org", 1, 0);
		//Create object for page classes
		HomePage hp=PageFactory.initElements(BaseClass.driver, HomePage.class);
		hp.clickOnOrg();
		Reporter.log("Clicked on Oragnizations");
		OrgPage op=PageFactory.initElements(BaseClass.driver, OrgPage.class);
		op.createOrg(orgName);
		Reporter.log("Organization saved");
		Assert.assertTrue(op.validateOrg(orgName),"Organization name is not matching");
		Reporter.log("Organization validation is success");
		
	}
}
