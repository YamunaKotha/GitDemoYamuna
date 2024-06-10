package YamunaPractice.Resources;
import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class XtentReports {
	
	public static ExtentReports xtentReports()
	{
		File file=new File(System.getProperty("user.dir")+"\\reports\\index.html");
		ExtentSparkReporter reporter=new ExtentSparkReporter(file);
		reporter.config().setDocumentTitle("Results");
		reporter.config().setReportName("My practice automation results");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		return extent;
	}

}
