package framework.engine.selenium;

import io.appium.java_client.android.AndroidDriver;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.After;
import org.junit.Before;

import java.io.IOException;
import java.net.MalformedURLException;

import static framework.engine.selenium.ReportFunctionalities.*;


public class AppiumTestBase {

    static AndroidDriver driver;
    private static DriverFactory driverFactory;

    @Before
    public void setUp() throws IOException, InvalidFormatException {
        newReport();
        androidDriverSetUp();
    }

    @After
    public void tearDown() throws IOException {
        finishReport();
        androidQuitDriver();
    }

    public static void androidDriverSetUp() throws MalformedURLException {
        driverFactory = new DriverFactory();
        driver = driverFactory.inicializarAndroidDriver();
        new AppiumWrapper(driver);
    }

    public static void androidQuitDriver() {
        driver.quit();
    }

}
