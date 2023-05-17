package aut.testcreation.steps;

import aut.testcreation.tasks.scotiabank.Datos;
import aut.testcreation.tasks.scotiabank.Login;
import aut.testcreation.tasks.scotiabank.Validar;
import framework.engine.bdd.CucumberBaseTestRunner;
import framework.engine.utils.LoadProperties;
import io.cucumber.java8.En;

import static aut.testcreation.pages.Page_ScotiabankHome.*;
import static framework.engine.selenium.SeleniumWrapper.escribirEnInput;

public class Stepdefs_ScotiabankHome extends CucumberBaseTestRunner implements En {
    public Stepdefs_ScotiabankHome() {
        Given("El Usuario se loguea en el Home Page", () -> {
            Login.Ingresar();
        });

        And("El Usuario ingresa los datos en los campos de Contactanos {string}", (String pDatos) -> {
            String[] lDatos = pDatos.split(", ");
            switch (pDatos) {
                case "pNombre, pApellidoPa, pApellidoMa, pEmail, pTelefono, pFax, pDomicilio, pRegion, pCP, pPais, pEstado, pAsunto, pEspecifique, pComentarios":
                    Datos.IngresarDatosContactanos(lDatos[0], lDatos[1], lDatos[2], lDatos[3], lDatos[4], lDatos[5], lDatos[6], lDatos[7], lDatos[8], lDatos[9], lDatos[10], lDatos[11], lDatos[12], lDatos[13]);
                    break;
            }
        });
        Then("El Ususario presiona el botón Enviar", () -> {
            Validar.BotonEnviar();
        });
    }
}