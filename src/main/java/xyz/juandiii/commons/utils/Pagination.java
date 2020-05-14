package xyz.juandiii.commons.utils;

public class Pagination {
  private Integer page;
  private Integer limit;
  private boolean more;

  public Pagination(Integer page, Integer limit, boolean more) {
    this.page = page;
    this.limit = limit;
    this.more = more;
  }

  public static Pagination paginationObject(Integer page, Integer limit, boolean more) {
    return new Pagination(page, limit, more);
  }

  public Integer getPage() {
    return page;
  }

  public Pagination setPage(Integer page) {
    this.page = page;
    return this;
  }

  public Integer getLimit() {
    return limit;
  }

  public Pagination setLimit(Integer limit) {
    this.limit = limit;
    return this;
  }

  public boolean isMore() {
    return more;
  }

  public Pagination setMore(boolean more) {
    this.more = more;
    return this;
  }
}
