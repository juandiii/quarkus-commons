package xyz.juandiii.commons.utils;

public class RestResponse {

  private String message;
  private Boolean hasErrors;
  private Integer code;
  private Object data;

  public RestResponse(Object data, String message, Boolean hasErrors, Integer code) {
    this.message = message;
    this.hasErrors = hasErrors;
    this.code = code;
    this.data = data;
  }

  public static RestResponse toResponse(Object data, String message, Boolean hasErrors, Integer code) {
    return new RestResponse(data, message, hasErrors, code);
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Boolean getHasErrors() {
    return hasErrors;
  }

  public void setHasErrors(Boolean hasErrors) {
    this.hasErrors = hasErrors;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }
}
