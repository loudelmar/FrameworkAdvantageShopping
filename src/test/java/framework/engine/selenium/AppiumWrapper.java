package framework.engine.selenium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AppiumWrapper extends AppiumTestBase{

    private static AndroidDriver driver;

    public AppiumWrapper(AndroidDriver driver) {
        AppiumWrapper.driver = driver;
    }

    public static WebElement encontrarElemento(By localizador) {
        return driver.findElement(localizador);
    }

    public static void clickear(By localizador){
        encontrarElemento(localizador).click();
    }

    public static void escribirEnInput(By localizador, String texto){
        encontrarElemento(localizador).sendKeys(texto);
    }

    public static void presionarTecla(AndroidKey tecla){
        driver.pressKey(new KeyEvent(tecla));
    }

}
