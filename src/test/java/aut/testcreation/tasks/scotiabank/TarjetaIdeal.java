package aut.testcreation.tasks.scotiabank;

import framework.engine.selenium.SeleniumWrapper;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;

import static aut.testcreation.pages.Page_ScotiaBank_TarjetaIdeal.*;
import static framework.engine.selenium.ReportFunctionalities.reporte;
import static framework.engine.utils.Constants.URL_SCOTIABANK;
import static framework.engine.utils.ExcelReader.extractDataToExcel;

public class TarjetaIdeal extends SeleniumWrapper {
    public TarjetaIdeal(WebDriver driver) {
        super(driver);
    }

    public static void IngresarTarjetasCredito() throws IOException, InvalidFormatException, AWTException {
        navegarURL(URL_SCOTIABANK);
        clickear(btnTarjetasDeCredito);
        clickear(btnSolicitarTarjetaIdeal);
    }

    public static void SolicitarTarjetaIdeal(String pPrimerNombre, String pSegundoNombre, String pPrimerApellido,
                                             String pSegundoApellido, String pFechaNacimiento, String pHomoclave) throws IOException, InvalidFormatException, AWTException, InterruptedException {
        escribirEnInput(txtPrimerNombre, extractDataToExcel(pPrimerNombre));
        escribirEnInput(txtSegundoNombre, extractDataToExcel(pSegundoNombre));
        escribirEnInput(txtPrimerApellido, extractDataToExcel(pPrimerApellido));
        escribirEnInput(txtSegundoApellido, extractDataToExcel(pSegundoApellido));
        escribirEnInput(txtFechaDeNacimiento, extractDataToExcel(pFechaNacimiento));
        escribirEnInput(txtHomoclave, extractDataToExcel(pHomoclave));
        clickear(btnContinuar);
        reporte.reportarEvento("", true, false);
    }
}
