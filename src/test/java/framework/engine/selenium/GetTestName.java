package framework.engine.selenium;

import framework.engine.utils.LoadProperties;

import java.io.IOException;

public class GetTestName {


    /**
     * Recibe el nombre del método del test actual y lo guarda en el archivo runtime.properties.
     * @param pTestName
     * @throws IOException
     */
    public static void getTestName(String pTestName) throws IOException {
        LoadProperties.getEscenario(pTestName);
    }

    /**
     * Obtiene el nombre del método del test actual y lo retorna.
     * @return El nombre del método actual o undefined.
     */
    public static String getMethodName(){
        if (Thread.currentThread().getStackTrace().length>2) {
            return Thread.currentThread().getStackTrace()[2].getMethodName();
        } else {
            return "undefined";
        }
    }
}
