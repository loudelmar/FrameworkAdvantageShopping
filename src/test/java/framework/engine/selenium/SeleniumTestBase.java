package framework.engine.selenium;

//import aut.testcreation.tasks.advantage.Login;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static framework.engine.selenium.ReportFunctionalities.*;
import static framework.engine.utils.Constants.*;

public class SeleniumTestBase{

    private static DriverFactory driverFactory;
    static WebDriver driver;
    //public static Login login;

    /**
     * Se ejecuta antes de cada test. Inicializa el driver y crea una nueva instancia de las Pages que se utilizarán.
     * @throws IOException
     * @throws InvalidFormatException
     */
    @BeforeEach
    void setUp() throws IOException, InvalidFormatException {
        driverFactory = new DriverFactory();
        driver = driverFactory.inicializarDriver(BROWSER);
        newReport();
        new SeleniumWrapper(driver);
    }

    /**
     * Se ejecuta después de cada test. Cierra el navegador quitando el driver y finaliza el reporte de Word.
     * @throws IOException
     */
    @AfterEach
    void close() throws IOException {
        driver.quit();
        finishReport();
    }
}
