package xyz.juandiii.commons.utils;

import java.util.ArrayList;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class RestResponse<T> {

    private String message;
    private Boolean hasErrors;
    private Integer code;
    private T data;
    private Object errors;

    public RestResponse() {
    }

    public RestResponse(T data, String message, Boolean hasErrors, Integer code) {
        this.message = message;
        this.hasErrors = hasErrors;
        this.code = code;
        this.data = data;
        this.errors = new ArrayList<>();
    }

    public static <T> RestResponse<T> toResponse(T data, String message, Boolean hasErrors, Integer code) {
        return new RestResponse<T>(data, message, hasErrors, code);
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

    public RestResponse<T> setHasErrors(Boolean hasErrors) {
        this.hasErrors = hasErrors;
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public RestResponse<T> setCode(Integer code) {
        this.code = code;
        return this;
    }

    public T getData() {
        return data;
    }

    public RestResponse<T> setData(T data) {
        this.data = data;
        return this;
    }

    public Object getErrors() {
        return errors;
    }

    public RestResponse<T> setErrors(Object errors) {
        this.errors = errors;
        return this;
    }
}
