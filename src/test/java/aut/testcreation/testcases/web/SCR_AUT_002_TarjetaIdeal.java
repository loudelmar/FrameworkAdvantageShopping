package aut.testcreation.testcases.web;

import aut.testcreation.tasks.scotiabank.Datos;
import aut.testcreation.tasks.scotiabank.Login;
import aut.testcreation.tasks.scotiabank.TarjetaIdeal;
import aut.testcreation.tasks.scotiabank.Validar;
import framework.engine.selenium.SeleniumTestBase;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.jupiter.api.Test;
import java.awt.*;
import java.io.IOException;
import static framework.engine.selenium.GetTestName.getMethodName;
import static framework.engine.selenium.GetTestName.getTestName;

public class SCR_AUT_002_TarjetaIdeal extends SeleniumTestBase {

    @Test
    void TC_002_01_SolicitarTarjetaIdeal() throws IOException, InvalidFormatException, AWTException, InterruptedException {
        getTestName(getMethodName());
        TarjetaIdeal.IngresarTarjetasCredito();
        TarjetaIdeal.SolicitarTarjetaIdeal("pPrimerNombre", "pSegundoNombre", "pPrimerApellido",
                "pSegundoApellido", "pFechaNacimiento", "pHomoclave");
        TarjetaIdeal.ClickEnCheckbox();
    }
    @Test
    void TC_002_02_SolicitarTarjetaIdeal() throws IOException, InvalidFormatException, AWTException, InterruptedException {
        getTestName(getMethodName());
        TarjetaIdeal.IngresarTarjetasCredito();
        TarjetaIdeal.SolicitarTarjetaIdeal("pPrimerNombre", "pSegundoNombre", "pPrimerApellido",
                "pSegundoApellido", "pFechaNacimiento", "pHomoclave");
        TarjetaIdeal.ClickEnCheckbox();
    }
}