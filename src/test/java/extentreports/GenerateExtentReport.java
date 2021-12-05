package extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class GenerateExtentReport {
    //***Get all sample code for new reports from Extent report site
    //ExtentReports extent=new ExtentReports();
    ExtentTest test;
    //ExtentHtmlReporter htmlReporter;
    ExtentReports extent = new ExtentReports();
    @Test
    void startReport() throws IOException {


        ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\dheeraj\\SampleSeleniumTestNG\\test-output\\"+ "nameOfFile.html");

        extent.attachReporter(spark);
        spark.loadXMLConfig(System.getProperty("user.dir")+ "\\extent-config.xml");

        test= extent.createTest("Random Test");
        test.pass("Test is Passed");
        test.info("Just for Info");
        extent.flush();
    }
    @AfterTest
    void clearAll(){
        extent.flush();
    }

}
