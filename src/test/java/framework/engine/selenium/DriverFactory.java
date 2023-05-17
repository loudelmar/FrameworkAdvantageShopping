package framework.engine.selenium;
import io.appium.java_client.android.AndroidDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static framework.engine.utils.Constants.*;
import static framework.engine.utils.Constants.SERVER_URL;

public class DriverFactory {

    public static ThreadLocal<WebDriver> hiloLocal = new ThreadLocal<>();

    /**
     * inicializa el WebDriver segun la seleccion del browser
     * @param pBrowser: chrome | firefox | edge
     * @return WebDriver
     */
    public WebDriver inicializarDriver(String pBrowser){

        System.out.println("browser value is: "+pBrowser);
        switch (pBrowser) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                hiloLocal.set(new FirefoxDriver());
                return initConfigurationBrowser();
            case "edge":
                WebDriverManager.edgedriver().setup();
                hiloLocal.set(new EdgeDriver());
                return initConfigurationBrowser();
            case "chrome":
                WebDriverManager.chromedriver().setup();
                hiloLocal.set(new ChromeDriver());
                return initConfigurationBrowser();
            default:
                throw new RuntimeException("Navegador no configurado: " + pBrowser);
        }
    }

    /**
     * retorna el WebDriver desde el ThreadLocal
     * @return WebDriver
     */
    public static synchronized WebDriver getDriver(){
        return hiloLocal.get();
    }

    private WebDriver initConfigurationBrowser() {
        if(getDriver() != null){
            getDriver().manage().deleteAllCookies();
            getDriver().manage().window().maximize();
            getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        }
        return getDriver();
    }

    public AndroidDriver inicializarAndroidDriver() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("appium:deviceName", DEVICE_NAME);
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
        desiredCapabilities.setCapability("appium:platformVersion", PLATFORM_VERSION);
        desiredCapabilities.setCapability("appium:udid", UDID);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 20);
        desiredCapabilities.setCapability("appium:noReset", true);
        desiredCapabilities.setCapability("appium:appPackage", APP_PACKAGE);
        desiredCapabilities.setCapability("appium:appActivity", APP_ACTIVITY);
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

        URL remoteUrl = new URL(SERVER_URL);

        return new AndroidDriver(remoteUrl, desiredCapabilities);
    }
}