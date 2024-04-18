package TestRunner;
 
import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\SAMITDES\\Desktop\\sprint2\\Query\\src\\test\\resource\\Features\\Shiksha.feature",glue="StepDefinition",tags="@Education")
/*plugin= {("pretty"),
"html:target/HTMLReports/ShikshaReport.html",	
"json:target/JSONReports/ShikshaReport.json",
"junit:target/JUNITReports/ShikshaReport.xml",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})*/

public class TestRunner extends AbstractTestNGCucumberTests{
}

