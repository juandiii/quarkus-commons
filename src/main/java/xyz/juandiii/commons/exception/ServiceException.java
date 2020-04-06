package xyz.juandiii.commons.exception;

public class ServiceException extends RuntimeException {

    public String message;
    public int statusCode = 999;

    private static final long serialVersionUID = 1L;
    
    public ServiceException() {
    }
  
    public ServiceException(String message, int status) {
      this.message = message;
      this.statusCode = status;
    }
  
    public int getStatusCode() {
      return this.statusCode;
    }
  
    public String getMessage() {
      return this.message;
    }
}