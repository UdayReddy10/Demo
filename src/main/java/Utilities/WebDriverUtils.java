package Utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/*browser operations
 * webelement operations
 * mouse operation
 * keyboard opertion
 * dropdown
 * alert handling
 * fileupload 
 * 
 */
public class WebDriverUtils {

	public static String getPageTitle()
	{
		String title=BaseClass.driver.getTitle();
		return title;
	}
	public static void enterValue(WebElement element,String value)
	{
		if(element.isDisplayed())
		{
			element.sendKeys(value);
		}
	}
	public String getVisibleText(WebElement element)
	{
		String text=element.getText();
		return text;
	}
	public static void mouseHovering(WebElement element)
	{
		Actions act=new Actions(BaseClass.driver);
		act.moveToElement(element).perform();
	}
	public static void dragDropOp(WebElement src,WebElement des)
	{
		Actions act=new Actions(BaseClass.driver);
		act.dragAndDrop(src, des).perform();
	}
	public static void pressTab()
	{
		Actions act=new Actions(BaseClass.driver);
		act.sendKeys(Keys.TAB).perform();
	}
	public static void pressEnter()
	{
		Actions act=new Actions(BaseClass.driver);
		act.sendKeys(Keys.ENTER).perform();
	}
	public static void SelectOption(WebElement drpdwn,int index)
	{
		Select sel=new Select(drpdwn);
		sel.selectByIndex(index);
	}
	public static void SelectOption(WebElement drpdwn,String value)
	{
		Select sel=new Select(drpdwn);
		sel.selectByValue(value);
	}
	public static void SelectOptionByText(WebElement drpdwn,String text)
	{
		Select sel=new Select(drpdwn);
		sel.selectByVisibleText(text);
	}
	public static void acceptAlert()
	{
		Alert alt=BaseClass.driver.switchTo().alert();
		alt.accept();
	}
	public static void dismissAlert()
	{
		Alert alt=BaseClass.driver.switchTo().alert();
		alt.dismiss();
	}
	public static String getAlertMsg()
	{
		Alert alt=BaseClass.driver.switchTo().alert();
		String text=alt.getText();
		return text;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
