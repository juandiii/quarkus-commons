package xyz.juandiii.commons.jdbc;

import java.util.List;

public interface EntityService<T, R> {

  T getById(R id);

  T add(T object);

  List<T> getAll();

  T update(R id, T object);

  void delete(R id);
}
