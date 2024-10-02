package org.example.utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.regex.Matcher;

public class PropertyReader {
    //Responsibilty of the Class is to give the value of by Key

    public static String readKey(String key)
    {
        Properties properties = new Properties();
        //this is a legacy class used in 1.2 JDK

        try
        {
            //Read the data.properties and give the key -> value

            FileInputStream fileInputStream = new FileInputStream("src/test/resources/data.properties");
            properties.load(fileInputStream);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return properties.getProperty(key);

    }
}
