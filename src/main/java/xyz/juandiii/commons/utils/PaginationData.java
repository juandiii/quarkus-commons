package xyz.juandiii.commons.utils;

public class PaginationData<T> {
  private T data;
  private Integer recordsTotal;
  private Integer recordsFiltered;
  private Pagination pagination;

  public PaginationData(T data, Integer recordsTotal, Integer recordsFiltered, Integer page, Integer limit, Integer offset) {
    this.data = data;
    this.recordsTotal = recordsTotal;
    this.recordsFiltered = recordsFiltered;
    this.pagination = Pagination.paginationObject(page, limit, (offset + limit) < recordsFiltered);
  }

  public T getData() {
    return data;
  }

  public PaginationData setData(T data) {
    this.data = data;
    return this;
  }

  public Pagination getPagination() {
    return pagination;
  }

  public PaginationData setPagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

  public Integer getRecordsTotal() {
    return recordsTotal;
  }

  public PaginationData setRecordsTotal(Integer recordsTotal) {
    this.recordsTotal = recordsTotal;
    return this;
  }

  public Integer getRecordsFiltered() {
    return recordsFiltered;
  }

  public PaginationData setRecordsFiltered(Integer recordsFiltered) {
    this.recordsFiltered = recordsFiltered;
    return this;
  }
}
