package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
         plugin = {"html:target/default-cucumber-reports.html",
                   "json:target/cucumber.json",
                 "json:target/json-reports/cucumber.json",
                 "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",
        glue ="stepdefinitions",
        tags ="@regressionTest",
        dryRun =false
        )
public class Runners {





}





