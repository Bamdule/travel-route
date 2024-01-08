package com.travelroute.domain.model.common.exception;


public class BusinessException extends RuntimeException {

    private final ExceptionCode exceptionCode;
    private final String message;


    public BusinessException(ExceptionCode exceptionCode, String message) {
        super(message);
        this.exceptionCode = exceptionCode;
        this.message = message;
    }

    public BusinessException(ExceptionCode exceptionCode) {
        super(exceptionCode.getMessage());
        this.exceptionCode = exceptionCode;
        this.message = exceptionCode.getMessage();
    }

    public ExceptionCode getExceptionCode() {
        return exceptionCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
