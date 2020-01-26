package com.github.orimajp.docman.system.error.exception;

public class AppBadRequestException extends AppException {
    public AppBadRequestException(String message) {
        super(message);
    }

    public AppBadRequestException(String message, String logAdditionalMessage) {
        super(message, logAdditionalMessage);
    }

    public AppBadRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppBadRequestException(String message, String logAdditionalMessage, Throwable cause) {
        super(message, logAdditionalMessage, cause);
    }
}
