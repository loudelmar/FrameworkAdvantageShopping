package aut.testcreation.pages;

import org.openqa.selenium.By;

public class Page_ScotiaBank_TarjetaIdeal {

        public static By btnTarjetasDeCredito = By.xpath("//a[.='Tarjetas de Crédito']");

        public static By btnSolicitarTarjetaIdeal = By.xpath("//span[.='Solicitar en Línea: Tarjeta IDEAL']");

        public static By txtPrimerNombre = By.id("personal_nombre");

        public static By txtSegundoNombre = By.id("personal_segundoNombre");

        public static By txtPrimerApellido = By.id("personal_apellidoPaterno");

        public static By txtSegundoApellido = By.id("personal_apellidoMaterno");

        public static By txtFechaDeNacimiento = By.id("personal_fechaNacimiento");

        public static By txtHomoclave = By.id("homoclave");

        public static By btnContinuar = By.cssSelector(".dfmxs-canvas-arrow-right");

        public static By chkAvisoPrivacidad = By.xpath("//label[contains(.,'Autorizo que Scotiabank me contacte, dé seguimiento a mi solicitud y acepto cono')]");
        public static By chkCompartirInformacion = By.xpath("//label[contains(.,'Autorizo que Scotiabank Inverlat S.A. y otras entidades que sean parte del Grupo')]");
        public static By chkTerms = By.xpath("//label[.='Acepto conocer los Términos y Condiciones.Declaración de Veracidad']");




}
