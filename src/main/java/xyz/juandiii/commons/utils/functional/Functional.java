package xyz.juandiii.commons.utils.functional;

import io.vertx.core.json.JsonObject;

public class Functional {

    public static JsonObject queryMaps(String sortBy) {
        JsonObject sort = new JsonObject();
        String[] fields = sortBy.split(",");
        for (String field : fields) {
            String[] orderBy = field.split(" ");
            System.out.println(orderBy.length);
            if (orderBy.length == 2) {
                sort.put(orderBy[0], orderBy[1]);
            }
        }

        return sort;
    }
}
