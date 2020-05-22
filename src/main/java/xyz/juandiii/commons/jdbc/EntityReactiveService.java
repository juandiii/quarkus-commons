package xyz.juandiii.commons.jdbc;

import io.smallrye.mutiny.Uni;

import java.util.List;

public interface EntityReactiveService<T, R> {

  Uni<T> getById(R id);

  Uni<T> add(T object);

  Uni<List<T>> getAll();

  Uni<T> update(R id, T object);

  Uni<Void> delete(R id);
}
