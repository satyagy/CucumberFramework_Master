package info.seleniumcucumber.utils;

import info.seleniumcucumber.pages.AbstractPage;
import org.apache.commons.lang3.StringUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static ConfigurationReader instance = null;
    private Properties prop;

    ConfigurationReader() {
         prop = new Properties();
        try{
            FileInputStream input = new FileInputStream(
                    System.getProperty("user.dir") + "/src/test/resources/configs/configuration.properties");
            prop.load(input);
        }catch(Exception e){
            System.out.println("Properties are not loaded");
        }
    }

    public static ConfigurationReader configuration() {
        try{
            if (instance == null) {
                instance = new ConfigurationReader();
            }
            return instance;
        } catch(Exception e){
            System.out.println("Configuration Instance is not created" + e);
        }
        return null;
    }

    public Properties getConfig() {
        return prop;
    }

    public String getProperty(String key) {
        if (!StringUtils.isBlank(System.getProperty(key))){
            return System.getProperty(key);
        }
        else{
            return getConfig().getProperty(key);
        }
    }
}