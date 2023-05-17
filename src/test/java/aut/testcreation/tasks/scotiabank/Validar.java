package aut.testcreation.tasks.scotiabank;

import framework.engine.selenium.SeleniumWrapper;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import java.awt.*;
import java.io.IOException;

import static aut.testcreation.pages.Page_ScotiabankHome.*;
import static framework.engine.selenium.ReportFunctionalities.reporte;

public class Validar extends SeleniumWrapper {
    public Validar(WebDriver driver) {
        super(driver);
    }
    public static void BotonEnviar() throws IOException, InvalidFormatException, AWTException {
        estaDesplegado(btnEnviar);
        reporte.reportarEvento("", true, false);
    }


}