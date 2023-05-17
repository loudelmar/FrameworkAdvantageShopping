package aut.testcreation.pages;

import org.openqa.selenium.By;

public class Page_AdvantageShoppingHome {

    public static By btnSearch = By.id("menuSearch");
    public static By barSearch = By.id("autoComplete");
    public static By barClose = By.cssSelector("[src='../../css/images/closeDark.png']");
    public static By imgProducto = By.cssSelector(".productName");
    public static By btnAddToCart = By.name("save_to_cart");
    public static By btnCarrito = By.id("shoppingCartLink");
    public static By btnCheckout = By.id("checkOutButton");
    public static By btnRegistration = By.id("registration_btnundefined");
    public static By btnUsername = By.name("usernameRegisterPage");
    public static By btnEmail = By.name("emailRegisterPage");
    public static By btnPassword = By.name("passwordRegisterPage");
    public static By btnConfirmPassword = By.name("confirm_passwordRegisterPage");
    public static By btnNombre = By.name("first_nameRegisterPage");
    public static By btnApellido = By.name("last_nameRegisterPage");
    public static By btnTelefono = By.name("phone_numberRegisterPage");
    public static By btnListaPais = By.name("countryListboxRegisterPage");

    //Escribir arg y darle enter para que seleccione argentina

    public static By btnCiudad = By.name("cityRegisterPage");
    public static By btnDireccion = By.name("addressRegisterPage");
    public static By btnProvincia = By.name("state_/_province_/_regionRegisterPage");
    public static By btnCodigoPostal = By.name("postal_codeRegisterPage");
    public static By btnAceptarTerms = By.id("register_btnundefined");
}
