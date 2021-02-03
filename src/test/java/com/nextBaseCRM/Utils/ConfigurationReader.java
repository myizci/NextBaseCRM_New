package com.nextBaseCRM.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private  static Properties properties = new Properties();

    static{

        FileInputStream file = null;
        try {
            file = new FileInputStream("configuration.properties");

            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static String getProperty(String keyWord){

        return properties.getProperty(keyWord);
    }
}
