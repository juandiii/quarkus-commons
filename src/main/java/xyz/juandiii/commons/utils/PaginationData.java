package xyz.juandiii.commons.utils;

public class PaginationData {
  private Object data;
  private Integer recordsTotal;
  private Integer recordsFiltered;
  private Pagination pagination;

  public PaginationData(Object data, Integer recordsTotal, Integer recordsFiltered, Pagination pagination) {
    this.data = data;
    this.recordsTotal = recordsTotal;
    this.recordsFiltered = recordsFiltered;
    this.pagination = pagination;
  }

  public static PaginationData paginationResponse(Object data, Integer recordsTotal, Integer recordsFiltered, Integer page, Integer limit, Integer offset) {
    return new PaginationData(data, recordsTotal, recordsFiltered, Pagination.paginationObject(page, limit, (offset + limit) < recordsFiltered));
  }

  public Object getData() {
    return data;
  }

  public PaginationData setData(Object data) {
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
