package aut.testcreation.tasks.advantageshopping;

import framework.engine.selenium.SeleniumWrapper;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;

import static aut.testcreation.pages.Page_AdvantageShoppingHome.*;
import static framework.engine.selenium.ReportFunctionalities.reporte;
import static framework.engine.utils.Constants.URL_ADVANTAGESHOPPING;
import static framework.engine.utils.ExcelReader.extractDataToExcel;

public class AdvantageShopping extends SeleniumWrapper {
    public AdvantageShopping(WebDriver driver) {super(driver);}
        public static void Ingresar() throws IOException, InvalidFormatException, AWTException, InterruptedException {
            navegarURL(URL_ADVANTAGESHOPPING);
            reporte.reportarEvento("", true, false);
            esperaEnSegundos();
        }
    public static void RegistrarUsuario(String pUsername, String pEmail, String pPassword, String pConfirmPassword,
                                        String pNombre, String pApellido, String pTelefono, String pCiudad,
                                        String pDireccion, String pProvincia, String pCodigoPostal) throws IOException, InvalidFormatException, AWTException, InterruptedException {
        escribirEnInput(btnUsername, extractDataToExcel(pUsername));
        escribirEnInput(btnEmail, extractDataToExcel(pEmail));
        escribirEnInput(btnPassword, extractDataToExcel(pPassword));
        escribirEnInput(btnConfirmPassword, extractDataToExcel(pConfirmPassword));
        escribirEnInput(btnNombre, extractDataToExcel(pNombre));
        escribirEnInput(btnApellido, extractDataToExcel(pApellido));
        escribirEnInput(btnTelefono, extractDataToExcel(pTelefono));
        escribirEnInput(btnCiudad, extractDataToExcel(pCiudad));
        escribirEnInput(btnDireccion, extractDataToExcel(pDireccion));
        escribirEnInput(btnProvincia, extractDataToExcel(pProvincia));
        escribirEnInput(btnCodigoPostal, extractDataToExcel(pCodigoPostal));
    }
}

