package xyz.juandiii.commons.utils.request;

import io.vertx.core.json.JsonObject;

public class RestRequest {
    private static final String FILTERS = "filters";
    private static final String SORT_BY = "sortBy";
    private static final String PAGE = "page";
    private static final String LIMIT = "limit";

    private final JsonObject json;

    public RestRequest(JsonObject json) {
        this.json = json;
    }

    public JsonObject toJson() {
        return json;
    }

    public JsonObject getFilters() {
        return json.getJsonObject(FILTERS);
    }

    public JsonObject getSortBy() {
        return json.getJsonObject(SORT_BY);
    }

    public Integer getPage() {
        return json.getInteger(PAGE) != null ? (json.getInteger(PAGE) > 0 ? json.getInteger(PAGE) - 1 : 0) : 0;
    }

    public Integer getLimit() {
        return json.getInteger(LIMIT) == null ? 10 : json.getInteger(LIMIT);
    }
}
