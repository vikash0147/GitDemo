package vikash.BDDFramework;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class ExtentReportTestNG implements ITestListener {

	public   ExtentSparkReporter SparkReporter ;
	public   ExtentReports extent;
	public   ExtentTest test;

	@Override
	public void onStart(ITestContext context) {

		SparkReporter = new ExtentSparkReporter( System.getProperty("user.dir") + "\\reports\\test.html");
		SparkReporter.config().setDocumentTitle("VikashTest");
		SparkReporter.config().setReportName("VIkash");			
		extent = new ExtentReports();
		
		extent.attachReporter(SparkReporter);

	}


	@Override
	public void onTestStart(ITestResult result) {

		test = extent.createTest(result.getName());
		
		System.out.println(result.getMethod().getMethodName());
		System.out.println(result.getName());
		
		System.out.println(result.getTestClass().getRealClass().getSimpleName());
		
		
		//test = extent.createTest(result.getName());
		
		
//		System.out.println("extent.createTest(result.getName())  " +  extent.createTest(result.getName()));
//
//		System.out.println("extent.createTest(result.getMethod().getMethodName())  " +  extent.createTest(result.getMethod().getMethodName()) );
//		System.out.println("extent.createTest(result.getMethod().getMethodName())  " +  result.getClass() );
//		System.out.println("extent.createTest(result.getMethod().getMethodName())  " +  result.getTestClass().getRealClass() );
//		System.out.println("extent.createTest(result.getMethod().getMethodName())  " +  result.getClass().getName() );

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		//test.assignCategory(result.getMethod().getGroups());
		test.createNode(result.getName());
		
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}


	@Override
	public void onFinish(ITestContext context) {


		extent.flush();
		// TODO Auto-generated method stub

	}

}
