package org.example.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports createInstance() {
        if (extent == null) {

            // 🔹 Create a timestamp for unique report names
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String reportPath = System.getProperty("user.dir") + "/test-output/ExtentReport_" + timeStamp + ".html";

            // 🔹 Initialize the Spark Reporter
            ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
            spark.config().setTheme(Theme.STANDARD);
            spark.config().setDocumentTitle("Automation Execution Report");
            spark.config().setReportName("Selenium Test Execution Report");
            spark.config().setEncoding("utf-8");
            spark.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

            // 🔹 Initialize ExtentReports
            extent = new ExtentReports();
            extent.attachReporter(spark);

            // 🔹 Add environment/system details
            extent.setSystemInfo("Tester", "Amsavalli");
            extent.setSystemInfo("Environment", "QA");
            extent.setSystemInfo("Browser", "Edge");
        }

        return extent;
    }
}
