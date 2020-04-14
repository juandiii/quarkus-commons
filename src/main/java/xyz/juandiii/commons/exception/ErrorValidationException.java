package xyz.juandiii.commons.exception;

import java.util.List;

public class ErrorValidationException extends RuntimeException {
    private List<String> errors;

    public ErrorValidationException(String message, List<String> errors) {
        super(message);
        this.errors = errors;
    }

    public List<String> getErrors() {
        return errors;
    }

    public ErrorValidationException setErrors(List<String> errors) {
        this.errors = errors;
        return this;
    }
}
