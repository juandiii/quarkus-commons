package xyz.juandiii.commons.utils.functional;

import io.vertx.core.json.JsonObject;
import org.apache.commons.codec.binary.Base64;

public class Functional {

    /**
     * Convert to JsonObject from Path Query.
     *
     * @param sortBy String
     * @return JsonObject
     */
    public static JsonObject queryMaps(String sortBy) {
        JsonObject sort = new JsonObject();
        String[] fields = sortBy.split(",");
        for (String field : fields) {
            String[] orderBy = field.split(" ");
            if (orderBy.length == 2) {
                sort.put(orderBy[0], orderBy[1]);
            }
        }
        return sort;
    }

    /**
     * Decode Json from access token
     *
     * @param jwt String
     * @return JsonObject
     */
    public static JsonObject decodeJWT(String jwt) {
        String[] splitString = jwt.split("\\.");
        String base64EncodeHeader = splitString[0];
        String base64EncodeBody = splitString[1];
        String base64EncodeSignature = splitString[2];

        Base64 base64Url = new Base64(true);
        String body = new String(base64Url.decode(base64EncodeBody));
        return new JsonObject(body);
    }
}
