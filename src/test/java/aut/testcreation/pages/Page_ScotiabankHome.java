package aut.testcreation.pages;

import org.openqa.selenium.By;

public class Page_ScotiabankHome {

    public static By btnContactar = By.xpath("(//span[.='Contáctanos'])[1]");
    public static By fldNombre = By.xpath("//input[contains(@id, 'txtName')]");
    public static By fldApellidoPaterno = By.xpath("(//input[contains(@id, 'txtLastName')])[1]");
    public static By fldApellidoMaterno = By.xpath("(//input[contains(@id, 'txtLastName')])[2]");
    public static By fldEmail = By.xpath("//input[contains(@id, 'txtEmail')]");
    public static By fldTelefono = By.xpath("//input[contains(@id, 'txtPhone')]");
    public static By fldFax = By.xpath("//input[contains(@id, 'txtFax')]");
    public static By fldCalleYNumero = By.xpath("//input[contains(@id, 'txtAddress')]");
    public static By fldRegion = By.xpath("//input[contains(@id, 'txtRegion')]");
    public static By fldCodigoPostal = By.xpath("//input[contains(@id, 'txtZip')]");
    public static By lstPais = By.xpath("//select[contains(@id, 'ddlCountries')]");
    public static By lstEstado = By.xpath("//select[contains(@id, 'ddlState')]");
    public static By lstAsunto = By.xpath("(//select[contains(@id, 'ddlSubject')])[1]");
    public static By lstEspecifique = By.xpath("//select[contains(@id, 'ddlSubjectSpecifics')]");
    public static By fldComentarios = By.xpath("//textarea[contains(@id, 'txtComments')]");
    public static By btnEnviar = By.xpath("//a[contains(@id, 'Submit')]");
}
