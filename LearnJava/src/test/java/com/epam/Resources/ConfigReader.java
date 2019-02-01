package com.epam.Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static FileInputStream fis;
    protected static Properties param;
    public void readPropertiesFile() throws IOException {
        fis = new FileInputStream("src\\test\\java\\com\\epam\\Resources\\Config.properties");
        param = new Properties();
        param.load(fis);
    }

    public String getApplicationURL(){
        return param.getProperty("URL");
    }
}
