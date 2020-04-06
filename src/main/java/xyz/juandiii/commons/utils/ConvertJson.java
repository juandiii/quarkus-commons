package xyz.juandiii.commons.utils;

import java.util.Map;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import org.jose4j.json.JsonUtil;

public class ConvertJson {
        private static Jsonb jsonb = JsonbBuilder.create();
    
        public static Map<String, Object> toMap(Object obj) throws Exception {
            String result = jsonb.toJson(obj);
            return JsonUtil.parseJson(result);
        }
    
        public static String toJson(Object obj) throws Exception {
            return jsonb.toJson(obj);
        }
    
        public static <T> T fromJson(Object object, Class<T> tClass) {
            if (object == null) {
                return null;
            }
            return jsonb.fromJson(object.toString(), tClass);
        }
}