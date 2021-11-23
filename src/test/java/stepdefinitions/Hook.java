package stepdefinitions;

import io.cucumber.java.After;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.io.File;
import java.io.IOException;

public class Hook {
    @Before
    public void beforeScenario() {
        System.out.println("Before Scenario");
    }
    @After
    public static void secreenshot()  {

        File src = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("target/screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
