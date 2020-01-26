package com.github.orimajp.docman.system.error.exception;

public class AppException extends RuntimeException {

    private String logAdditionalMessage;

    private AppException() {
    }

    public AppException(String message) {
        super(message);
    }

    public AppException(String message, String logAdditionalMessage) {
        super(message);
        this.logAdditionalMessage = logAdditionalMessage;
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppException(String message, String logAdditionalMessage, Throwable cause) {
        super(message, cause);
        this.logAdditionalMessage = logAdditionalMessage;
    }

    private AppException(Throwable cause) {
        super(cause);
    }

    private AppException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public String getLogAdditionalMessage() {
        return logAdditionalMessage == null ? getMessage() :
                String.format("%s %s", getMessage(), logAdditionalMessage);
    }

}
