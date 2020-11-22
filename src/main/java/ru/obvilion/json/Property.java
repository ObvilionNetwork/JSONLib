package ru.obvilion.json;

import java.util.Enumeration;
import java.util.Properties;

/**
 * Создаёт массив из .properties файла
 */
public class Property {

    public static JSONObject toJSONObject(java.util.Properties properties) throws JSONException {
        JSONObject jo = new JSONObject();
        if (properties != null && !properties.isEmpty()) {
            Enumeration<?> enumProperties = properties.propertyNames();
            while(enumProperties.hasMoreElements()) {
                String name = (String)enumProperties.nextElement();
                jo.put(name, properties.getProperty(name));
            }
        }
        return jo;
    }

    public static Properties toProperties(JSONObject jo)  throws JSONException {
        Properties  properties = new Properties();
        if (jo != null) {
            for (final String key : jo.keySet()) {
                Object value = jo.opt(key);
                if (!JSONObject.NULL.equals(value)) {
                    properties.put(key, value.toString());
                }
            }
        }
        return properties;
    }
}
