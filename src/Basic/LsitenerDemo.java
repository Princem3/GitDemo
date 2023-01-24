package Basic;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class LsitenerDemo implements ITestListener
{

@Override
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("Used for reports");
}
@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Used to take screenshot"+result.getName());
	}
}
