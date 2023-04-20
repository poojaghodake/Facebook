package testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(
features = {"C:\\Users\\DELL\\eclipse-workspace\\Facebook\\Feature\\Facebook.feature"},
glue = {"stepDefination"},
dryRun = false,
monochrome= true,
publish=true,
plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)


public class TestRunner {

}
