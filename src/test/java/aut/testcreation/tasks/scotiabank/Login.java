package aut.testcreation.tasks.scotiabank;

import framework.engine.selenium.SeleniumWrapper;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;

import static aut.testcreation.pages.Page_ScotiabankHome.*;
import static framework.engine.selenium.ReportFunctionalities.reporte;
import static framework.engine.utils.Constants.URL_SCOTIABANK;

public class Login extends SeleniumWrapper {
    public Login(WebDriver driver) {super(driver);}

    public static void Ingresar() throws IOException, InvalidFormatException, AWTException {
        navegarURL(URL_SCOTIABANK);
        reporte.reportarEvento("", true, false);
        clickear(btnContactar);
        reporte.reportarEvento("", true, false);
    }

}