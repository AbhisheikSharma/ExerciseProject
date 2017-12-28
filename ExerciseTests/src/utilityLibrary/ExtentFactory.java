package utilityLibrary;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
	public static ExtentReports getInstance() {
		ExtentReports extent;
		String Path =("./")+"/Reports/testresults.html";
		extent = new ExtentReports(Path);
		extent
	     .addSystemInfo("Selenium Version", "x.xx")
	     .addSystemInfo("Platform", "Wi Windows");
		return extent;
	}
}