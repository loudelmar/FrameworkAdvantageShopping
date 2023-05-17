package aut.testcreation.tasks.scotiabank;

import framework.engine.selenium.SeleniumWrapper;
import framework.engine.utils.ExcelReader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;

import static aut.testcreation.pages.Page_ScotiabankHome.*;
import static framework.engine.selenium.ReportFunctionalities.reporte;
import static framework.engine.utils.ExcelReader.extractDataToExcel;

public class Datos extends SeleniumWrapper {
    public Datos(WebDriver driver) {
        super(driver);
    }

    public static void IngresarDatosContactanos(String pNombre, String pApellidoPa, String pApellidoMa, String pEmail, String pTelefono, String pFax, String pDomicilio, String pRegion, String pCP, String pPais, String pEstado, String pAsunto, String pEspecifique, String pComentarios) throws IOException, InvalidFormatException, AWTException, InterruptedException {
        escribirEnInput(fldNombre, extractDataToExcel(pNombre));
        escribirEnInput(fldApellidoPaterno, extractDataToExcel(pApellidoPa));
        escribirEnInput(fldApellidoMaterno, extractDataToExcel(pApellidoMa));
        escribirEnInput(fldEmail, extractDataToExcel(pEmail));
        escribirEnInput(fldTelefono, extractDataToExcel(pTelefono));
        escribirEnInput(fldFax, extractDataToExcel(pFax));
        escribirEnInput(fldCalleYNumero, extractDataToExcel(pDomicilio));
        escribirEnInput(fldRegion, extractDataToExcel(pRegion));
        escribirEnInput(fldCodigoPostal, extractDataToExcel(pCP));
        seleccionarOpcionPorTexto(lstPais, extractDataToExcel(pPais));
        seleccionarOpcionPorTexto(lstEstado, extractDataToExcel(pEstado));
        seleccionarOpcionPorTexto(lstAsunto, extractDataToExcel(pAsunto));
        seleccionarOpcionPorTexto(lstEspecifique, extractDataToExcel(pEspecifique));
        reporte.reportarEvento("", true, false);
        escribirEnInput(fldComentarios, extractDataToExcel(pComentarios));
        reporte.reportarEvento("", true, false);
    }
}
