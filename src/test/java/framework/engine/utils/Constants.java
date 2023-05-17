package framework.engine.utils;

import lombok.extern.apachecommons.CommonsLog;

import java.util.Properties;

@CommonsLog
public class Constants {

    private Constants() {
    }

    static Properties properties = LoadProperties.loadProperties();
    public static final String URL_SCOTIABANK = properties.getProperty("url.scotiabank");
    public static final String URL_ADVANTAGESHOPPING = properties.getProperty("url.advantageshopping");
    public static final String IS_DEBUG = properties.getProperty("debug");
    public static final String BROWSER = properties.getProperty("browser");
    public static final String RUNTIME_FILENAME = properties.getProperty("runtime.filename");
    public static final String DATATABLES_PATH = properties.getProperty("datatables.path");
    public static final String DESCRIPTIONS_PATH = properties.getProperty("descriptions.path");
    public static final String ESPERA_HASTA = properties.getProperty("esperaHasta");
    public static final String TIEMPO_ESPERA = properties.getProperty("tiempoEspera");
    public static final String FILES_PATH = properties.getProperty("files.path");
    public static String EXCEPTION = null;

    // Android
    public static final String DEVICE_NAME = properties.getProperty("device.name");
    public static final String PLATFORM_VERSION = properties.getProperty("platform.version");
    public static final String UDID = properties.getProperty("udid");
    public static final String APP_PACKAGE = properties.getProperty("app.package");
    public static final String APP_ACTIVITY = properties.getProperty("app.activity");
    public static final String SERVER_URL = properties.getProperty("server.url");
}
