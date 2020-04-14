package xyz.juandiii.commons.utils;

import java.util.ArrayList;

public class RestResponse {

    private String message;
    private Boolean hasErrors;
    private Integer code;
    private Object data;
    private Object errors;

    public RestResponse(Object data, String message, Boolean hasErrors, Integer code) {
        this.message = message;
        this.hasErrors = hasErrors;
        this.code = code;
        this.data = data;
        this.errors = new ArrayList<>();
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

    public Object getErrors() {
        return errors;
    }

    public RestResponse setErrors(Object errors) {
        this.errors = errors;
        return this;
    }
}
