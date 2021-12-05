package listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomListeners extends TestListenerAdapter {

    public void onTestStart(ITestResult tr){ //take object parameter of ITestResult
        System.out.println("Test Case Started");
    }
    public void onTestSuccess(ITestResult tr){
        System.out.println("Test Case Success");
    }
    public void onTestFailure(ITestResult tr){
        System.out.println("Test Case Failed");
    }
    public void onTestSkipped(ITestResult tr){
    System.out.println("Test Case Skipped");
    }

}
