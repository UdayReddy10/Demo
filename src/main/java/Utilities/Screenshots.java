package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Screenshots implements ITestListener{
	public void onTestStart(ITestResult result) {
	}
	public void onTestSuccess(ITestResult result) {
		EventFiringWebDriver screen=new EventFiringWebDriver(BaseClass.driver);
		File src=screen.getScreenshotAs(OutputType.FILE);
		File des=new File(System.getProperty("user.dir")+"\\passedScreen\\Capture_"+System.currentTimeMillis()+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			System.out.println("Screenshot not copied");
		}		
	}
	public void onTestFailure(ITestResult result) {
		EventFiringWebDriver screen=new EventFiringWebDriver(BaseClass.driver);
		File src=screen.getScreenshotAs(OutputType.FILE);
		File des=new File(System.getProperty("user.dir")+"\\failedScreen\\Capture_"+System.currentTimeMillis()+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			System.out.println("Screenshot not copied");
		}				
	}
	public void onTestSkipped(ITestResult result) {
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}
	public void onStart(ITestContext context) {
	}
	public void onFinish(ITestContext context) {
	}

}
