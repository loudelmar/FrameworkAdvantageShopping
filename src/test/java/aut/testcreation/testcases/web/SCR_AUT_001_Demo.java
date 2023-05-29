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

public class SCR_AUT_001_Demo extends SeleniumTestBase {

    @Test
    void TC_001_01_EnviarMensaje() throws IOException, InvalidFormatException, AWTException, InterruptedException {
        getTestName(getMethodName());
        Login.Ingresar();
        Datos.IngresarDatosContactanos("pNombre", "pApellidoPa", "pApellidoMa", "pEmail", "pTelefono", "pFax", "pDomicilio","pRegion", "pCP", "pPais", "pEstado", "pAsunto", "pEspecifique", "pComentarios");
        //Validar.BotonEnviar();
    }


}