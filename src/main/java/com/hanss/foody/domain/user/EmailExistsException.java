package com.hanss.foody.domain.user;

public class EmailExistsException extends RuntimeException {
    private static final long serialVersionUID = 0L;
    public EmailExistsException() {
        super();
    }
    public EmailExistsException(final String message) {
        super(message);
    }
    public EmailExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}