package xyz.juandiii.commons.utils;

import java.util.Map;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import org.jose4j.json.JsonUtil;

public class ConvertJson {
    private static Jsonb jsonb = JsonbBuilder.create();

    /**
     * Convert Object to Map
     *
     * @param obj Object
     * @return Object
     * @throws Exception Throw exception
     */
    public static Map<String, Object> toMap(Object obj) throws Exception {
        String result = jsonb.toJson(obj);
        return JsonUtil.parseJson(result);
    }

    /**
     * Convert Object to string JSON
     *
     * @param obj Object
     * @return String
     * @throws Exception Throw exception
     */
    public static String toJson(Object obj) throws Exception {
        return jsonb.toJson(obj);
    }

    /**
     * Convert JsonObject to Object Class
     *
     * @param object Object
     * @param tClass Class
     * @param <T>    Class
     * @return Object
     */
    public static <T> T fromJson(Object object, Class<T> tClass) {
        if (object == null) {
            return null;
        }
        return jsonb.fromJson(object.toString(), tClass);
    }
}