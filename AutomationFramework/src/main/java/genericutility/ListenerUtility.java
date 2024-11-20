package genericutility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;


public class ListenerUtility extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		test = extReport.createTest(result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getName() + "is failed");
		TakesScreenshot ts = (TakesScreenshot) sdriver;
		test.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64)); // to add screenshot in extent
																						// reports

		// to add screenshot in screenshots folder
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/" + result.getName() + jUtil.getSystemTime() + ".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
