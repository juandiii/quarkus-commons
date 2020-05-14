package xyz.juandiii.commons.jdbc;

import io.vertx.mutiny.sqlclient.Row;

@FunctionalInterface
public interface HandlerFrom<T> {
  T from(Row row);
}
