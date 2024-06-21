package facebook.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\DINESH KUMAR\\eclipse-workspace\\FaceBook\\src\\test\\resources\\FeatureFiles",
                             glue = {"facebook.com","in.facebook.Hooks"},
                             tags = "@facebook",
                             dryRun = false,
                             monochrome = true,
                             plugin = {"html:target","json:target/report.json"},
                             strict = true)
                            
public class TestRunner {

}

