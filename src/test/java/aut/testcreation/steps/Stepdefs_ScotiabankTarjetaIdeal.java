package aut.testcreation.steps;

import aut.testcreation.tasks.scotiabank.Datos;
import aut.testcreation.tasks.scotiabank.Login;
import aut.testcreation.tasks.scotiabank.TarjetaIdeal;
import aut.testcreation.tasks.scotiabank.Validar;
import framework.engine.bdd.CucumberBaseTestRunner;
import io.cucumber.java8.En;
import org.apache.commons.compress.archivers.tar.TarFile;

public class Stepdefs_ScotiabankTarjetaIdeal extends CucumberBaseTestRunner implements En {
    public Stepdefs_ScotiabankTarjetaIdeal() {
        Given("^El Usuario ingresa en tarjeta ideal$", () -> {
            TarjetaIdeal.IngresarTarjetasCredito();
        });

        And("El Usuario ingresa los datos en los campos de Solicitar Tarjeta Ideal {string}", (String pDatos) -> {
            String[] lDatos = pDatos.split(", ");
            switch (pDatos) {
                case "pPrimerNombre, pSegundoNombre, pPrimerApellido, pSegundoApellido, pFechaNacimiento, pHomoclave":
                    TarjetaIdeal.SolicitarTarjetaIdeal(lDatos[0], lDatos[1], lDatos[2], lDatos[3], lDatos[4], lDatos[5]);
                    break;
            }
        });
        Then("^El Usuario presiona checkbox$", () -> {
            TarjetaIdeal.ClickEnCheckbox();
        });

    }
}