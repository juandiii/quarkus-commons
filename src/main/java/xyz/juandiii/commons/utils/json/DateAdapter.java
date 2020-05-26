package xyz.juandiii.commons.utils.json;

import javax.json.Json;
import javax.json.JsonValue;
import javax.json.bind.adapter.JsonbAdapter;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateAdapter implements JsonbAdapter<LocalDateTime, JsonValue> {
  @Override
  public JsonValue adaptToJson(LocalDateTime localDateTime) throws Exception {
    DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
      .withZone(ZoneId.systemDefault());
    return Json.createValue(DATE_TIME_FORMATTER.format(localDateTime));
  }

  @Override
  public LocalDateTime adaptFromJson(JsonValue jsonValue) throws Exception {
    String dateTime = jsonValue.toString().substring(1, jsonValue.toString().length() - 1);
    DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
      .withZone(ZoneId.systemDefault());
    return LocalDateTime.parse(dateTime, DATE_TIME_FORMATTER);
  }
}
