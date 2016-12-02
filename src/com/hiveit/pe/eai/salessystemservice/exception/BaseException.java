package com.hiveit.pe.eai.salessystemservice.exception;

public class BaseException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private Exception exception;
    private String code;
    private String message;
    
    public BaseException(String code, String message, Exception exception) {
        super(message);
        this.exception = exception;
        this.code = code;
        this.message = message;
    }

    public BaseException(String code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public BaseException(String message, Exception exception) {
        super(message);
        this.exception = exception;
        this.message = message;
    }

    public BaseException(Exception exception) {
        this.exception = exception;
    }

    public BaseException(String message) {
        super(message);
        this.message = message;
    }

    @Override
	public String getMessage() {
        return message;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public String getCode() {
        return code;
    }

}


	

