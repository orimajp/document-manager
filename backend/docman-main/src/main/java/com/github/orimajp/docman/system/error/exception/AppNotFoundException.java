package com.github.orimajp.docman.system.error.exception;

public class AppNotFoundException extends AppException {
    public AppNotFoundException(String message) {
        super(message);
    }

    public AppNotFoundException(String message, String logAdditionalMessage) {
        super(message, logAdditionalMessage);
    }

    public AppNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppNotFoundException(String message, String logAdditionalMessage, Throwable cause) {
        super(message, logAdditionalMessage, cause);
    }
}
